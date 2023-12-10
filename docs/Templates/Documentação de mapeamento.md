# Financial Transaction CDM
Financial CDM Mapping

# Data Mappings

| Target Object |               Source Object               |
|:-------------:|:-----------------------------------------:|
|   Financial Transaction CDM    | Financial Transaction Event |


| Field                | Mapping               |                Data Type                 | Manatory | Mapping Rules                                                             | Comments                                                                                                  |
| -------------------- | --------------------- |:----------------------------------------:|:--------:| ------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `id`                 | `uuid()`              |                 `String`                 |   Yes    | Generated only at the API level                                           |                                                                                                           |
| `timestamp`          | `timestamp`           |               `Date Time`                |   Yes    | Date time formatted as `YYYY-MM-DDThh:mm:ss` pointing to the mid-nigth    | Intended to only present date information, but for consistency across the platform, date time format used |
| `effectiveTimestamp` | `timestamp`           |               `Date Time`                |   Yes    | Date time formatted as `YYYY-MM-DDThh:mm:ss` pointing to the mid-nigth    | Intended to only present date information, but for consistency across the platform, date time format used |
| `transactionDetails` |                       |                 `Object`                 |   Yes    |                                                                           |                                                                                                           |
| &emsp; `type`        | `transactionType`     | `Receita / Despesa / Poupança / Crédito` |   Yes    |                                                                           |                                                                                                           |
| &emsp; `category`    | `transactionCategory` |                 `String`                 |   Yes    |                                                                           |                                                                                                           |
| &emsp; `amount`      | `transactionAmount`   |                  `Int`                   |   Yes    | The value received is multiplied by 100 and stores in the Database as Int |                                                                                                           |

# Change Log

| Update Date | App Version | API Spec Version | Comments  |
|:-----------:|:-----------:|:----------------:| --------- |
| YYYY-MM-DD  |    1.0.0    |      1.0.0       | A comment |
