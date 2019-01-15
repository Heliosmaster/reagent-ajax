# reagent-ajax

Basic Leiningen template for web applications with
[reagent](https://github.com/reagent-project/reagent), using ajax and the
[transit format](https://github.com/cognitect/transit-clj) to
communicate with the backend.

It integrates [figwheel](https://github.com/bhauman/lein-figwheel)

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
- Compile the clojurescript with

```
lein cljsbuild once prod
```

- Create the jar with

```
lein uberjar
```

- Run it

## Directory structure of generated app

```
├── README.md
├── .gitignore
├── dev
│   ├── clj
│   │   └── user.clj
│   └── cljs
│       └── <project_name>
│           └── dev.cljs
├── project.clj
├── resources
│   └── public
│       ├── css
│       │   └── screen.css
│       └── index.html
├── src
│   ├── clj
│   │   └── <project_name>
│   │       ├── core.clj
│   │       └── server.clj
│   └── cljs
│       └── <project_name>
│           └── core.cljs
├── target
│   └── figwheel_temp
│       └── dev
│           └── figwheel
└── test
    └── clj
        └── <project_name>
            └── core_test.clj
```

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
