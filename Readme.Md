# REST API Mutant (JOHN CAMILO BENITEZ ALEMAN)

Aplicacion para probar si un ADN es mutante o no

Hecho en java 8 con spring

# REST API

seguir los pasos descritos

## Obetener stats de mutantes

### Request

`GET /muntant/v1/stats`

    curl -i -H 'Accept: application/json' http://localhost:8080/muntant/v1/stats

### Response

    [
    {
        "countMutantDna": 10,
        "countHumanDna": 100,
        "ratio": 0.1
    },
    {
        "countMutantDna": 40,
        "countHumanDna": 100,
        "ratio": 0.4
    },
    {
        "countMutantDna": 35,
        "countHumanDna": 100,
        "ratio": 0.35
    }
    ]

## saber si ADN es mutante

### Request

`POST /muntant/v1/ismutant`

    curl -i -H 'Accept: application/json' -d 'name=Foo&status=new' http://localhost:8080/muntant/v1/ismutant

### Response

    true

