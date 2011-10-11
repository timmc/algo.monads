{:namespaces
 ({:source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads/clojure.algo.monads-api.html",
   :name "clojure.algo.monads",
   :author "Konrad Hinsen",
   :doc
   "This library contains the most commonly used monads as well\nas macros for defining and using monads and useful monadic\nfunctions."}),
 :vars
 ({:arglists ([f]),
   :name "call-cc",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L478",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/call-cc",
   :doc
   "A computation in the cont monad that calls function f with a single\nargument representing the current continuation. The function f should\nreturn a continuation (which becomes the return value of call-cc),\nor call the passed-in current continuation to terminate.",
   :var-type "function",
   :line 478,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L462",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/cont-m",
   :namespace "clojure.algo.monads",
   :line 462,
   :var-type "var",
   :doc
   "Monad describing computations in continuation-passing style. The monadic\nvalues are functions that are called with a single argument representing\nthe continuation of the computation, to which they pass their result.",
   :name "cont-m"}
  {:arglists ([name doc-string operations] [name operations]),
   :name "defmonad",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L48",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/defmonad",
   :doc
   "Define a named monad by defining the monad operations. The definitions\nare written like bindings to the monad operations m-bind and\nm-result (required) and m-zero and m-plus (optional).",
   :var-type "macro",
   :line 48,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists
   ([name docstring? attr-map? args expr]
    [name docstring? attr-map? (args expr) ...]),
   :name "defmonadfn",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L134",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/defmonadfn",
   :doc
   "Like defn, but for functions that use monad operations and are used inside\na with-monad block.",
   :var-type "macro",
   :line 134,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([steps expr] [name steps expr]),
   :name "domonad",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L111",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/domonad",
   :doc
   "Monad comprehension. Takes the name of a monad, a vector of steps\ngiven as binding-form/monadic-expression pairs, and a result value\nspecified by expr. The monadic-expression terms can use the binding\nvariables of the previous steps.\nIf the monad contains a definition of m-zero, the step list can also\ncontain conditions of the form :when p, where the predicate p can\ncontain the binding variables from all previous steps.\nA clause of the form :let [binding-form expr ...], where the bindings\nare given as a vector as for the use in let, establishes additional\nbindings that can be used in the following steps.",
   :var-type "macro",
   :line 111,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([]),
   :name "fetch-state",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L356",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/fetch-state",
   :doc
   "Return a state-monad function that returns the current state and does not\nmodify it.",
   :var-type "function",
   :line 356,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([key]),
   :name "fetch-val",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L362",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/fetch-val",
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreturns the value corresponding to the given key. The state is not modified.",
   :var-type "function",
   :line 362,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L283",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/identity-m",
   :namespace "clojure.algo.monads",
   :line 283,
   :var-type "var",
   :doc
   "Monad describing plain computations. This monad does in fact nothing\nat all. It is useful for testing, for combination with monad\ntransformers, and for code that is parameterized with a monad.",
   :name "identity-m"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L214",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-chain",
   :namespace "clojure.algo.monads",
   :line 214,
   :var-type "var",
   :doc
   "Chains together monadic computation steps that are each functions\nof one parameter. Each step is called with the result of the previous\nstep as its argument. (m-chain (step1 step2)) is equivalent to\n(fn [x] (domonad [r1 (step1 x) r2 (step2 r1)] r2)).",
   :name "m-chain"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L192",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-fmap",
   :namespace "clojure.algo.monads",
   :line 192,
   :var-type "var",
   :doc
   "Bind the monadic value m to the function returning (f x) for argument x",
   :name "m-fmap"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L186",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-join",
   :namespace "clojure.algo.monads",
   :line 186,
   :var-type "var",
   :doc
   "Converts a monadic value containing a monadic value into a 'simple'\nmonadic value.",
   :name "m-join"}
  {:arglists ([n f]),
   :name "m-lift",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L177",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-lift",
   :doc
   "Converts a function f of n arguments into a function of n\nmonadic arguments returning a monadic value.",
   :var-type "macro",
   :line 177,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L208",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-map",
   :namespace "clojure.algo.monads",
   :line 208,
   :var-type "var",
   :doc
   "'Executes' the sequence of monadic values resulting from mapping\nf onto the values xs. f must return a monadic value.",
   :name "m-map"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L225",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-reduce",
   :namespace "clojure.algo.monads",
   :line 225,
   :var-type "var",
   :doc
   "Return the reduction of (m-lift 2 f) over the list of monadic values mvs\nwith initial value (m-result val).",
   :name "m-reduce"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L197",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-seq",
   :namespace "clojure.algo.monads",
   :line 197,
   :var-type "var",
   :doc
   "'Executes' the monadic values in ms and returns a sequence of the\nbasic values contained in them.",
   :name "m-seq"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L238",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-until",
   :namespace "clojure.algo.monads",
   :line 238,
   :var-type "var",
   :doc
   "While (p x) is false, replace x by the value returned by the\nmonadic computation (f x). Return (m-result x) for the first\nx for which (p x) is true.",
   :name "m-until"}
  {:arglists ([test m-expr]),
   :name "m-when",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L250",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-when",
   :doc
   "If test is logical true, return monadic value m-expr, else return\n(m-result nil).",
   :var-type "macro",
   :line 250,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([test m-expr]),
   :name "m-when-not",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L256",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/m-when-not",
   :doc
   "If test if logical false, return monadic value m-expr, else return\n(m-result nil).",
   :var-type "macro",
   :line 256,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L293",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/maybe-m",
   :namespace "clojure.algo.monads",
   :line 293,
   :var-type "var",
   :doc
   "Monad describing computations with possible failures. Failure is\nrepresented by nil, any other value is considered valid. As soon as\na step returns nil, the whole computation will yield nil as well.",
   :name "maybe-m"}
  {:arglists ([m] [m nothing] [m nothing which-m-plus]),
   :name "maybe-t",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L518",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/maybe-t",
   :doc
   "Monad transformer that transforms a monad m into a monad in which\nthe base values can be invalid (represented by nothing, which defaults\nto nil). The third argument chooses if m-zero and m-plus are inherited\nfrom the base monad (use :m-plus-from-base) or adopt maybe-like\nbehaviour (use :m-plus-from-transformer). The default is :m-plus-from-base\nif the base monad m has a definition for m-plus, and\n:m-plus-from-transformer otherwise.",
   :var-type "function",
   :line 518,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([operations]),
   :name "monad",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L33",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/monad",
   :doc
   "Define a monad by defining the monad operations. The definitions\nare written like bindings to the monad operations m-bind and\nm-result (required) and m-zero and m-plus (optional).",
   :var-type "macro",
   :line 33,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([base which-m-plus operations]),
   :name "monad-transformer",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L496",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/monad-transformer",
   :doc
   "Define a monad transforer in terms of the monad operations and the base\nmonad. The argument which-m-plus chooses if m-zero and m-plus are taken\nfrom the base monad or from the transformer.",
   :var-type "macro",
   :line 496,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([c]),
   :name "run-cont",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L473",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/run-cont",
   :doc
   "Execute the computation c in the cont monad and return its result.",
   :var-type "function",
   :line 473,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L306",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/sequence-m",
   :namespace "clojure.algo.monads",
   :line 306,
   :var-type "var",
   :doc
   "Monad describing multi-valued computations, i.e. computations\nthat can yield multiple values. Any object implementing the seq\nprotocol can be used as a monadic value.",
   :name "sequence-m"}
  {:arglists ([m] [m which-m-plus]),
   :name "sequence-t",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L550",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/sequence-t",
   :doc
   "Monad transformer that transforms a monad m into a monad in which\nthe base values are sequences. The argument which-m-plus chooses\nif m-zero and m-plus are inherited from the base monad\n(use :m-plus-from-base) or adopt sequence-like\nbehaviour (use :m-plus-from-transformer). The default is :m-plus-from-base\nif the base monad m has a definition for m-plus, and\n:m-plus-from-transformer otherwise.",
   :var-type "function",
   :line 550,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L320",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/set-m",
   :namespace "clojure.algo.monads",
   :line 320,
   :var-type "var",
   :doc
   "Monad describing multi-valued computations, like sequence-m,\nbut returning sets of results instead of sequences of results.",
   :name "set-m"}
  {:arglists ([s]),
   :name "set-state",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L350",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/set-state",
   :doc
   "Return a state-monad function that replaces the current state by s and\nreturns the previous state.",
   :var-type "function",
   :line 350,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([key val]),
   :name "set-val",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L380",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/set-val",
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreplaces the value associated with key by val. The old value is returned.",
   :var-type "function",
   :line 380,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L333",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/state-m",
   :namespace "clojure.algo.monads",
   :line 333,
   :var-type "var",
   :doc
   "Monad describing stateful computations. The monadic values have the\nstructure (fn [old-state] [result new-state]).",
   :name "state-m"}
  {:arglists ([p f x]),
   :name "state-m-until",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L398",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/state-m-until",
   :doc
   "An optimized implementation of m-until for the state monad that\nreplaces recursion by a loop.",
   :var-type "function",
   :line 398,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([m]),
   :name "state-t",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L577",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/state-t",
   :doc
   "Monad transformer that transforms a monad m into a monad of stateful\ncomputations that have the base monad type as their result.",
   :var-type "function",
   :line 577,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([f]),
   :name "update-state",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L344",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/update-state",
   :doc
   "Return a state-monad function that replaces the current state by the\nresult of f applied to the current state and that returns the old state.",
   :var-type "function",
   :line 344,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([key f]),
   :name "update-val",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L370",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/update-val",
   :doc
   "Return a state-monad function that assumes the state to be a map and\nreplaces the value associated with the given key by the return value\nof f applied to the old value. The old value is returned.",
   :var-type "function",
   :line 370,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([monad & exprs]),
   :name "with-monad",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L99",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/with-monad",
   :doc
   "Evaluates an expression after replacing the keywords defining the\nmonad operations by the functions associated with these keywords\nin the monad definition given by name.",
   :var-type "macro",
   :line 99,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([key statement]),
   :name "with-state-field",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L386",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/with-state-field",
   :doc
   "Returns a state-monad function that expects a map as its state and\nruns statement (another state-monad function) on the state defined by\nthe map entry corresponding to key. The map entry is updated with the\nnew state returned by statement.",
   :var-type "function",
   :line 386,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:arglists ([empty-accumulator]),
   :name "writer-m",
   :namespace "clojure.algo.monads",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L435",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/writer-m",
   :doc
   "Monad describing computations that accumulate data on the side, e.g. for\nlogging. The monadic values have the structure [value log]. Any of the\naccumulators from clojure.contrib.accumulators can be used for storing the\nlog data. Its empty value is passed as a parameter.",
   :var-type "function",
   :line 435,
   :file "src/main/clojure/clojure/algo/monads.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/writer-m-add",
   :namespace "clojure.algo.monads",
   :var-type "function",
   :arglists ([container value]),
   :doc "add value to container, return new container",
   :name "writer-m-add"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/writer-m-combine",
   :namespace "clojure.algo.monads",
   :var-type "function",
   :arglists ([container1 container2]),
   :doc "combine two containers, return new container",
   :name "writer-m-combine"}
  {:file "src/main/clojure/clojure/algo/monads.clj",
   :raw-source-url
   "https://github.com/clojure/algo.monads/raw/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj",
   :source-url
   "https://github.com/clojure/algo.monads/blob/651c349a929a7f6aa2a8d326860bff564994a335/src/main/clojure/clojure/algo/monads.clj#L410",
   :wiki-url
   "http://clojure.github.com/algo.monads//clojure.algo.monads-api.html#clojure.algo.monads/writer-monad-protocol",
   :namespace "clojure.algo.monads",
   :line 410,
   :var-type "var",
   :doc "Accumulation of values into containers",
   :name "writer-monad-protocol"})}
