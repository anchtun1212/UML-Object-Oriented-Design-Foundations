# UML-Object-Oriented-Design-Foundations
UML and Object-Oriented Design Foundations

# Prerequisites

Download StartUML for the creation of UML diagrams: https://staruml.io/

Download Atom as a free and open-source text and source code editor developped by GitHub: https://atom.io/

# You can Test Polymorphism example:

com.anchtun.ood.polymorphism.Test

# To see UML diagrams: Use Case/Class Diagram/Sequence Diagram/Activity Diagram go to:

/src/resources/uml

# How to get a licensed version of StarUML

1) Install asar via npm: `sudo npm i asar -g`

2) `cd /opt/StarUML/resources/`

3) `sudo asar extract app.asar app`

4) Edit: `/opt/StarUML/resources/app/src/engine/license-manager.js`
 
Change this

  checkLicenseValidity () {
    if (packageJSON.config.setappBuild) {
      setStatus(this, true)
    } else {
      this.validate().then(() => {
        setStatus(this, true)
      }, () => {
        setStatus(this, false)
        UnregisteredDialog.showDialog()
      })
    }
  }
  
to this

  checkLicenseValidity () {
    // if (packageJSON.config.setappBuild) {
      setStatus(this, true)
    // } else {
    //   this.validate().then(() => {
    //     setStatus(this, true)
    //   }, () => {
    //     setStatus(this, false)
    //     UnregisteredDialog.showDialog()
    //   })
    // }
  }

5) Repackage app: `sudo asar pack app app.asar` 

Enjoy you have a licensed Version of StarUML !!!.
