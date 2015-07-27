def addition(num1, num2)
  if(num1 != 0 && num2 != 0)
    sum = num1 + num2
    print "\n", num1, " + ", num2, " = ", sum
  else
    print "\nOps! \nNeed and input of two integers not equal to zero."
  end
end

print "We should try addition with your choice of numbers :) \n"
print "Enter the first number: "
a = gets.chop().to_i
print "Enter the second number: "
b = gets.chop().to_i

addition(a,b)