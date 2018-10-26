# Kullanıcı Adı ve Şifre Kontrolü

defusername = "MasterPriva"
defpassword = "12345Priva"

while (True):

    username = input("\nUsername:")
    password = input("Password:")

    if ((defusername == username) and (defpassword == password)):
        print("\nWelcome back,", username + "!")
        break

    elif ((defusername != username) and (defpassword == password)):
        print("\nUsername is Wrong! \nPlease Try Again...")

    elif ((defusername == username) and (defpassword != password)):

        answer = input("\nForgot Your Password? \nPress 'Enter' to Change Your Password")

        if (answer == ""):
            securityquestion = input("\nWhat was your favorite childhood cartoon?:")

            if (securityquestion == "SamuraiJack"):

                while(True):

                    newpassword = input("\nNew Password:")
                    realnewpassword = input("Confirm New Password:")

                    if(realnewpassword == newpassword):
                        defpassword = newpassword
                        print("\nPlease Wait... \nYour Password Changed Succesfully")
                        break

                    else:
                        print("\nConfirmation Incorrect \nPlease Try Again...")

            else:
                print("\nSecurity Question Incorrect \nReturning to Main Menu")
        else:
            print("\nPlease Try Again...")

    else:
        print("\nPlease Try Again...")
