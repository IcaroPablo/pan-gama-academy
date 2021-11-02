# Basic practice on mongodb

This exercise aims to get us, students used to basic `CRUD` operations on a Mongo `database`. All the `JSONs` generated on my database can be found in the [documents.json](documents.json) file in this folder :)

For this exercise I created a "Carros" colection in a test database and inserted in it documents with just four attributes, you can follow the steps below for a linux environment demonstration.

## Initial commands to get ourselves started

- At first we need to start the server:
```shell
$ sudo systemctl start mongodb
```

- Then we enter the `Mongo CLI`:
```shell
$ mongosh
```

- Create a new database for our tests:
```shell
use testedb
```

- Create a new `collection` for our tests:
```javascript
testdb> db.createCollection("carros")
```

## Practicing queries

#### Inserting Documents
- Populate our collection using the following command:
```javascript
testdb> db.coll.insertOne()
```
>_You can check all the insertions I made clicking on the button below to expand the collapsed list_
<details>
    <summary><strong>button below :P</strong></summary>

```javascript
testdb> db.getCollection("carros").insertOne({
    "marca" : "audi",
    "cor" : "preta",
    "ano" : 2021,
    "modelo" : "A4"
})

testdb> db.getCollection("carros").insertOne({
    "marca" : "chevrolet",
    "cor" : "vermelha",
    "ano" : 2018,
    "modelo" : "camaro"
})

testdb> db.getCollection("carros").insertOne({
    "marca" : "chevrolet",
    "cor" : "branca",
    "ano" : 2019,
    "modelo" : "cruze"
})

testdb> db.getCollection("carros").insertOne({
    "marca" : "nissan",
    "cor" : "azul",
    "ano" : 2020,
    "modelo" : "versa"
})

testdb> db.getCollection("carros").insertOne({
    "marca" : "nissan",
    "cor" : "branca",
    "ano" : 2020,
    "modelo" : "leaf"
})

testdb> db.getCollection("carros").insertOne({
    "marca" : "toyota",
    "cor" : "prata",
    "ano" : 2022,
    "modelo" : "corolla"
})

testdb> db.getCollection("carros").insertOne({
    "marca" : "toyota",
    "cor" : "prata",
    "ano" : 2021,
    "modelo" : "prius"
})

testdb> db.getCollection("carros").insertOne({
    "marca" : "toyota",
    "cor" : "preta",
    "ano" : 2021,
    "modelo" : "etios"
})
```
      
</details>
<br>

#### Updating documents
- Update the attribute "cor" for all documents in which the "modelo" attribute equals "etios":
>_Atualizar para branca a cor de todos os carros cujo modelo é etios_
```javascript
testdb> db.getCollection("carros").update( { modelo: "etios" }, { $set: { cor: "branca" } })
```
<br>

#### Removing documents
- Delete all the documents in which the "modelo" attribute equals "etios":
>_Remover todos os carros cujo modelo é etios_
```javascript
testdb> db.getCollection("carros").remove({modelo: "etios"})
```
<br>

#### Consulting documents
- Simple consult by attribute ("marca = toyota"):
>_Encontrar todos os carros da marca toyota_
```javascript
testdb> db.getCollection("carros").find({marca: "toyota"})
```
<br>

#### Consulting with projections
- Shows the "ano" _column_ of all the documents in which the "cor" attribute equals "azul":
>_Exibir o ano de todos os carros cuja cor é azul_
```javascript
testdb> db.getCollection("carros").find({cor: "azul"}, {ano: 1})
```
<br>

#### Consulting combining selectors
- Consult combining the selectors, in this case, shows all the documents in which the "ano" attribute is `>=` 2019 `and` `<=` 2021:
>_Exibir todos os carros cujo ano é maior ou igual a 2019 e menor ou igual a 2021_
```javascript
testdb> db.getCollection("carros").find({ ano: { $gte: 2019 }, ano:{ $lte: 2021} })
```
<br>

#### Consult ordering results
- Consult showing all the documents in the collection limited to 3 results, ordered by the "ano" attribute:
>_Exibir todos os carros da base de dados, limitando a 3 resultados, ordenando por ano_
```javascript
testdb> db.getCollection("carros").find().limit(3).sort({ano: 1})
```
