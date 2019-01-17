# Change Log
All notable changes to this project will be documented in this file. This change log follows the conventions of [keepachangelog.com](http://keepachangelog.com/).

## [Unreleased][unreleased]

## 0.1.5 - 2019-01-17
### Fixed

- Correctly use sanitized project name in `index.html`

## 0.1.4 - 2019-01-15
### Added
 - Use [mount](https://github.com/tolitius/mount) for component lifecycle
 - Include [cljs-devtools](https://github.com/binaryage/cljs-devtools) for easier work on frontend
 - Use `org.slf4j/slf4j-log4j12` for logging and include a `log4j.properties` with log-level set to `WARN`, so that logging isn't too verbose by default.

### Changed
 - Updated dependencies to Clojure 1.10. Reagent was kept at 0.7.0 for the moment.
 - Switched from [ring-transit](https://github.com/jalehman/ring-transit) to [ring-middleware-format](https://github.com/ngrunwald/ring-middleware-format) to do serialization / deserialization

### Removed
 - Removed `wrap-cljs-repl` from `cemerick/piggieback`

## 0.1.3 - 2017-05-20
### Changed
 - Updated dependencies

## 0.1.2 - 2017-02-05
### Changed
 - Updated dependencies

### Fixed
 - Added `output-dir` to `prod` profile, due to an error of figwheel.

## 0.1.1 - 2016-01-24
### Changed
 - Updated dependencies

## 0.1.0 - 2015-12-13
### Added
 - Project created

[Unreleased]:
https://github.com/Heliosmaster/reagent-ajax/compare/v0.1.5...HEAD
