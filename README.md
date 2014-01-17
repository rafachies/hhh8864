This is a simple project that simulates the hibernate issue HHH8864.
The count distinct query can be fired calling the REST service through http://localhost:8080/hhh8864/rest/demo
We just need to create the datasource in the server app (described in peristence.xml). We can also change the dialect as we need test the issue with other db, but the issue seems to be specific for the Postgres dialect. I've already testes with mysql and the query worked fine.
