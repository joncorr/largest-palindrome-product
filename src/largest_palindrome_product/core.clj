(ns largest-palindrome-product.core
  (:gen-class))

(defn palindrome? [number]
   (let [numberStr
        (if (instance? java.lang.String number)
          number
          (.toString number))
         middleNumber (/ (.length numberStr) 2)
         firstHalf (.substring numberStr 0 middleNumber)
         secondHalf
         (apply str
          (reverse
           (.substring numberStr middleNumber)))
          ]
         (= firstHalf secondHalf)))


(defn bigOh2 []
  (loop [number 100 palindromes[]]
   (if (= number 999)
      palindromes
       (let [pals
       (for [x (range 100 (inc 999))
         :let [product (* number x)]
         :when (palindrome? product)] product)]
         (recur (inc number) (into palindromes pals))))))


(defn -main
  [& args]
 (prn (str "The largest palindrome resulting from the product of two three-digit numbers is "
  (last (sort (bigOh2))))))
