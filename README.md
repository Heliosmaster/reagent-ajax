# figwheel-reagent

Basic Leiningen template with [reagent](https://github.com/holmsand/reagent)
and [figwheel](https://github.com/bhauman/lein-figwheel).

This uses a different directory structure and dependencies than [reagent-figwheel](https://github.com/gadfly361/reagent-figwheel)

## Usage

To create an application with this template:

```
lein new figwheel-reagent <project_name>
```

## Run in development mode

- Start a repl with `lein repl`
- run `(go)`, this will start figwheel, the server on port 8080, and other bootstrapping stuff
- If you want a cljs repl, run `cljs-repl` from the `user` namespace
- Visit `http://localhost:8080`

## Run in production mode
- Create the jar with

```
lein uberjar
```

- Run it

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
