# Basic practice on mongodb

This exercise aims to get us, students used to basic `CRUD` operations on a Mongo `database`.
For this exercise I created a "Carros" colection in a test database and inserted in it documents with just four attributes, you can follow the steps below for a linux environment demonstration.

- At first we need to start the server:
```console
sudo systemctl start mongodb
```
- Then we enter the `Mongo CLI`:
```console
mongosh
```
- Create a new database for our tests:
```console
use testedb
```
- Create a new `collection` for our tests:
```console
db.createCollection("carros")
```
- Populate our collection using the following command:
```console
db.coll.insertOne({})
```
>_You can check all the insertions I made clicking on the button below to expand the collapsed list_

- Update the attribute "cor" for all documents in which the "modelo" attribute equals "etios":
>_Atualizar para branca a cor de todos os carros cujo modelo é etios_
db.getCollection("carros").update( { modelo: "etios" }, { $set: { cor: "branca" } })

- Delete all the documents in which the "modelo" attribute equals "etios":
>_Remover todos os carros cujo modelo é etios
db.getCollection("carros").remove({modelo: "etios"})

- Simple consult by attribute ("marca = toyota"):
>_Encontrar todos os carros da marca toyota_
db.getCollection("carros").find({marca: "toyota"})

- Consult with projections, in this case, shows the "ano" _column_ of all the documents in which the "cor" attribute equals "azul":
>_Exibir o ano de todos os carros cuja cor é azul_
db.getCollection("carros").find({cor: "azul"}, {ano: 1})

- Consult combining the selectors, in this case, shows all the documents in which the "ano" attribute is `>=` 2019 `and` `<=` 2021:
//exibir todos os carros cujo ano é maior ou igual a 2019 e menor ou igual a 2021
db.getCollection("carros").find({ ano: { $gte: 2019 }, ano:{ $lte: 2021} })

- Consult showing all the documents in the collection ordered by the "ano" attribute:
//ordenar todos os carros por ano
db.getCollection("carros").find().sort({ano: 1})
