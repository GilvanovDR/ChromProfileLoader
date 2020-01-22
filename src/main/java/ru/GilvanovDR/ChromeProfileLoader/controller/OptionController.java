/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.ChromeProfileLoader.controller;

import ru.GilvanovDR.ChromeProfileLoader.Form.OptionsForm;

import java.awt.event.MouseEvent;

public class OptionController {
   public void onOkButtonClick() {
       System.out.println("ButtonOk");
   }
   public void onCancelButtonClick() {
       OptionsForm.getInstance().closeForm();
   }
}
