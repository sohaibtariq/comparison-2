# CardDeleteResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | HTTP response content type for this operation                                                                            |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | HTTP response status code for this operation                                                                             |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_check_mark:                                                                                                       | Raw HTTP response; suitable for custom response parsing                                                                  |
| `cardDeletion`                                                                                                           | [org.openapis.openapi.models.shared.CardDeletion](../../models/shared/CardDeletion.md)                                   | :heavy_minus_sign:                                                                                                       | Deleted the card                                                                                                         |