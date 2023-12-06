# LinksResponse


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `count`                                                                                      | *Long*                                                                                       | :heavy_minus_sign:                                                                           | The number of results in the current response.                                               |
| `limit`                                                                                      | *Long*                                                                                       | :heavy_minus_sign:                                                                           | How many results to return.                                                                  |
| `offset`                                                                                     | *Long*                                                                                       | :heavy_minus_sign:                                                                           | An integer that designates the offset at which to begin returning results. Defaults to 0.    |
| `data`                                                                                       | List<[org.openapis.openapi.models.shared.LinkResponse](../../models/shared/LinkResponse.md)> | :heavy_minus_sign:                                                                           | list of links<br/>                                                                           |