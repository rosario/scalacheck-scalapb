package com.example

object Hello {
  def increase(sr: SearchRequest) = {
    sr.copy(pageNumber = sr.pageNumber + 1)
  }
}
