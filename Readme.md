
# Weather API

In this project, instead of relying on our own weather data, we will build a weather API that fetches and returns weather data from a 3rd party API. This project will help you understand how to work with 3rd party APIs, caching, and environment variables.


## API Reference

#### Get item

```http
  GET /api/v1/weather/${city}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `city`      | `string` | **Required**. city of item to fetch |


## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`API_KEY`

From [Visual Crossing’s API]("https://www.visualcrossing.com/weather-api/")

