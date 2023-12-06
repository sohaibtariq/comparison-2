# ReportRetrieveRequest


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `uplId`                                                                                   | *String*                                                                                  | :heavy_check_mark:                                                                        | ID of the upload                                                                          |                                                                                           |
| `status`                                                                                  | [org.openapis.openapi.models.operations.Status](../../models/operations/Status.md)        | :heavy_minus_sign:                                                                        | The status of line items to filter and retrieve. By default all line items are returned.  |                                                                                           |
| `limit`                                                                                   | *Long*                                                                                    | :heavy_minus_sign:                                                                        | How many results to return.                                                               | 10                                                                                        |
| `offset`                                                                                  | *Long*                                                                                    | :heavy_minus_sign:                                                                        | An integer that designates the offset at which to begin returning results. Defaults to 0. |                                                                                           |