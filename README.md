# quizGeekFest


## Installation

- Clone the repository

- Install dependences with maven

- Install mysql server



#### Get question amount

```http
  GET localhost:8080/questions/amount
```

| Parameter | Return     | Description                |
| :-------- | :------- | :------------------------- |
| `` | `int` | returns how many questions there are in the database | 

#### get question

```http
  GET localhost:8080/questions/{id}
```

| Parameter | Return     | Description                       |
| :-------- | :------- | :-------------------------------- |
| ``      | `Question` |returns the question by id |



## Authors

- [@dmarqss](https://github.com/dmarqss)

