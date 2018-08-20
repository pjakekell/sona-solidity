# Sonar-Solidity [![Build Status](https://travis-ci.org/stylianos-agapiou-sonarsource/sonar-solidity.svg?branch=master)](https://travis-ci.org/stylianos-agapiou-sonarsource/sonar-solidity) [![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=org.sonarsource.solidity%3Asonar-solidity&metric=alert_status)](https://sonarcloud.io/dashboard?id=org.sonarsource.solidity%3Asonar-solidity) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=org.sonarsource.solidity%3Asonar-solidity&metric=coverage)](https://sonarcloud.io/component_measures?id=org.sonarsource.solidity%3Asonar-solidity&metric=coverage)

**SonarSolidity**: is a SonarQube static code analyzer for Solidity Smart Contracts.

To begin with you should install a SonarQube 7.2+ instance (https://www.sonarqube.org/downloads/).

Please follow the instructions provided.

## Building

```bash
mvn clean install
```

## Features
* Metrics (cognitive complexity, number of lines, number of contracts etc)
* 25 Rules

[ANTLR4](https://github.com/solidityj/solidity-antlr4) grammar to build the Parser and the Lexer.

SonarSolidity supports the import of reports from[ ```Solium linter version 1.0.0``` ](http://solium.readthedocs.io/en/latest/).
* 13 Security Rules
* 32 Style Rules

## Documentation

Please read [documentation](https://github.com/stylianos-agapiou-sonarsource/sonar-solidity/blob/master/Sonar%20Solidity%20Docs.pdf) on how to take advantage of this feature.

## License

Licensed under the [GNU Lesser General Public License, Version 3.0](http://www.gnu.org/licenses/lgpl.txt)
