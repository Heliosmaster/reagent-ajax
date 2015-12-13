# reagent-ajax

Basic Leiningen template for web applications with
[reagent](https://github.com/holmsand/reagent), using ajax and the
[transit format](https://github.com/cognitect/transit-clj) to
communicate with the backend.

It integrates [figwheel](https://github.com/bhauman/lein-figwheel) and
makes the `cljs-repl` easily accessible.

## Usage

To create an application with this template:

```
lein new reagent-ajax <project_name>
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

## Acknowledgments

Thanks to [Daniel Marjenburgh](https://github.com/dmarjenburgh) for
inspiration and the code to start the CLJS repl.
