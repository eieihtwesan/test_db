package com.napier.sem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

//package com.napier.sem;
//
//public class App {
//    public static void main(String[] args) {
//        System.out.println("Boo yah!");
//    }
//}

//package com.napier.sem;
//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.MongoCollection;
//import org.bson.Document;
//
//public class App
//{
//    public static void main(String[] args)
//    {
//        // Connect to MongoDB
//        // on local system - we're using port 27000
//        MongoClient mongoClient = new MongoClient("mongo-dbserver");
//        // Get a database - will create when we use it
//        MongoDatabase database = mongoClient.getDatabase("mydb");
//        // Get a collection from the database
//        MongoCollection<Document> collection = database.getCollection("test");
//        // Create a document to store
//        Document doc = new Document("name", "Kevin Sim")
//                .append("class", "Software Engineering Methods")
//                .append("year", "2021")
//                .append("result", new Document("CW", 95).append("EX", 85));
//        // Add document to collection
//        collection.insertOne(doc);
//
//        // Check document in collection
//        Document myDoc = collection.find().first();
//        System.out.println(myDoc.toJson());
//    }
//}
