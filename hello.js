db.post.updateMany(
    { "replys.userId": 1 },
    { $set: { "replys.$[ee].userId": 50 } },
    { arrayFilters: [{ "ee.userId": 1 }] }
);

db.post.find({ "replys.id": 1 }).pretty();
db.post.find({ "replys.0.id": 1 }).prety();
db.post.find({ replys: { $elemMatch: { id: 2, userId: 50 } } }).pretty();
db.post.find({ replys: { $elemMatch: { id: 2, userId: 50 } } }, { "replys.$": 1 }).pretty();


db.food.find().pretty();

db.food.find({ _id: 1, fruit: "banana" }).pretty();
db.food.updateOne({ _id: 1, fruit: "banana" }, { $set: { "fruit.$": "melon" } });



db.users.find({ "username": "user101" }).explain("executionStats");