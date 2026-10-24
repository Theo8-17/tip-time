package com.example

import java.text.NumberFormat
import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {

  @Test
  fun calculateTip_default15Percent() {
    val amount = 100.00
    val expectedTip = NumberFormat.getCurrencyInstance().format(15.00)
    val actualTip = calculateTip(amount = amount)
    assertEquals(expectedTip, actualTip)
  }

  @Test
  fun calculateTip_20Percent() {
    val amount = 10.00
    val tipPercent = 20.00
    val expectedTip = NumberFormat.getCurrencyInstance().format(2.00)
    val actualTip = calculateTip(amount = amount, tipPercent = tipPercent)
    assertEquals(expectedTip, actualTip)
  }
}
