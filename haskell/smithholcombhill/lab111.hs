{-# LANGUAGE ImplicitParams #-}
import Debug.Trace

isEven x
    | x `mod` 2 == 0 = True
    | otherwise = False

isOdd x = isEven (x+1)

increment x = (x+1)

decrement x = (x-1)

factorial x 
    | x > 1 = factorial(decrement x)*x
    | otherwise = 1

count x = length x

