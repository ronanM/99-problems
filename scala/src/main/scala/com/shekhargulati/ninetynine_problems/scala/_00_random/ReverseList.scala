package com.shekhargulati.ninetynine_problems.scala._00_random

/**
  * Write a program to reverse the direction of a given singly-linked list.
  * In other words, after the reversal all pointers should now point backwards. Your algorithm should take linear time.
  */
object ReverseList {

  def reverse[T](list: List[T]): List[T] = list match {
    case head :: tail => reverse(tail) :+ head
    case _ => Nil
  }

  def main(args: Array[String]) {
    val numbers = List(1, 2, 3)
    println(reverse(numbers))

  }
}