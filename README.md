# Dayalima Klob

Klob Technical Test Using Java Spring Boot

## Setup

- Database table and data are put into `klob.sql` file
- Default port is 8331, you can change it in `application.properties`

## API

All this API end point are using `GET` method

1. to get Category list (company, community and education) use this endpoint
   `{baseUrl}/api/klob/get-categories`
2. to get all list use this endpoint
   `{baseUrl}/api/klob` or `{baseUrl}/api/klob?page=0&size=3` where `page` and `size` is numeric or if you want customize page and size
3. to get detail use this endpoint
   `{baseUrl}/api/klob/detail/{id}` where `id` is numeric
