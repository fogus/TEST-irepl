(ns fogus
  (:require [clojure.core.cache :as cache]))

(comment

  (require 'cognitect.rebl)
  (cognitect.rebl/ui :mode :in-proc)

  (def C1 (cache/fifo-cache-factory {:a 1, :b 2}))
  
  (cognitect.rebl/inspect C1)

  (cognitect.rebl/inspect (class C1))

  (cognitect.rebl/inspect (.cache C1))

  (cognitect.rebl/inspect (cache/lookup C1 :b))

  (cognitect.rebl/inspect (cache/through-cache C1 :c (constantly 42)))

  (require '[clojure.core.protocols :as p])
  (require '[clojure.datafy :as d])

  (extend-protocol p/Datafiable
    clojure.core.cache.FIFOCache
    (datafy [c]
      (seq (.cache c))))
)

