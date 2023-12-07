import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Pasos {

	@Given("Abro el navegador y me dirijo a la página")
	def Abro_el_navegador_y_me_dirijo_a_la_página() {
		WebUI.openBrowser("https://katalon-demo-cura.herokuapp.com/")
		WebUI.maximizeWindow()
	}

	@When("Presiono el botón Make Appointment")
	def Presiono_el_botón_Make_Appointment() {
		WebUI.click(findTestObject('Object Repository/MakeButton'))
	}

	@And("Pongo el nombre la contraseña e inicio sesión")
	def Pongo_el_nombre_la_contraseña_e_inicio_sesión() {
		WebUI.setText(findTestObject('Object Repository/Usuario'), 'John Doe')
		WebUI.setText(findTestObject('Object Repository/Contrasena'), 'ThisIsNotAPassword')
		WebUI.click(findTestObject('Object Repository/LoginBtn'))
	}

	@And("Coloco los datos correspondientes")
	def Coloco_los_datos_correspondientes() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Lista'), 'Hongkong CURA Healthcare Center', false)
		WebUI.click(findTestObject('Object Repository/Checkbox'))
		WebUI.click(findTestObject('Object Repository/Radio'))
		WebUI.setText(findTestObject('Object Repository/Date'), '11/11/2019')
		WebUI.setText(findTestObject('Object Repository/Comment'), 'Se acabó este año')
	}


	@And("Presiono el botón Book Appointment")
	def Presiono_el_botón_Book_Appointment() {
		WebUI.click(findTestObject('Object Repository/BookButton'))
	}
	
	@And("Vuelvo a la página principal")
	def Vuelvo_a_la_página_principal() {
		WebUI.click(findTestObject('Object Repository/ToHomepage'))
	}
	
	@Then("Cierro el navegador")
	def Cierro_el_navegador() {
		WebUI.closeBrowser()
	}
}