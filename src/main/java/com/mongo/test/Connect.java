package com.mongo.test;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by Administrator on 2016/11/30.
 */
public class Connect {
    public static void main(String args[]) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        MongoDatabase database = mongoClient.getDatabase("dx");

        MongoCollection<Document> collection = database.getCollection("test");

        //输出集合总条数
        System.out.println(collection.count());

        //插入文档 {"name":"MongoDB","type":"database","count":1,"versions": ["v3.2","v3.0","v2.6"],"info": { x :203, y :102}  }
        //  Document doc = new Document("name", "MongoDB")
        //          .append("type", "database")
        //          .append("count", 1)
        //          .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
        //          .append("info", new Document("x", 203).append("y", 102));
        //
        //  collection.insertOne(doc);

        //批量插入文档
        //List<Document> documents = new ArrayList<Document>();
        //for (int i = 0; i < 100; i++) {
        //    documents.add(new Document("i", i));
        //}
        //collection.insertMany(documents);

        //查询第一条记录
        // Document myDoc = collection.find().first();
        // System.out.println(myDoc.toJson());


        //遍历所有记录1）
        //MongoCursor<Document> cursor = collection.find().iterator();
        //try {
        //    while (cursor.hasNext()) {
        //        System.out.println(cursor.next().toJson());
        //    }
        //} finally {
        //    cursor.close();
        //}

        //遍历所有记录2）
        //for (Document cur : collection.find()) {
        //    System.out.println(cur.toJson());
        //}


        //根据一个条件查询
        //Document myDoc = collection.find(eq("i", 71)).first();
        //System.out.println(myDoc.toJson());


        //多条件查询
        //Block<Document> printBlock = new Block<Document>() {
        //    public void apply(final Document document) {
        //        System.out.println(document.toJson());
        //    }
        //};
        //collection.find(or(eq("i", 50), eq("i", 90))).forEach(printBlock);

        //更新
        //collection.updateOne(eq("i", 10), new Document("$set", new Document("i", 110)));

        //批量更新
        //UpdateResult updateResult = collection.updateMany(lt("i", 100), inc("i", 100));
        //System.out.println(updateResult.getModifiedCount());

        //批量更新
        //UpdateResult updateResult = collection.updateMany(lt("i", 100), new Document("$inc", new Document("i", 100)));
        //System.out.println(updateResult.getModifiedCount());


        //删除一个符合条件的数据（）
        //collection.deleteOne(eq("i", 110));

        //批量删除
        //DeleteResult deleteResult = collection.deleteMany(gte("i", 100));
        //System.out.println(deleteResult.getDeletedCount());




    }
}
