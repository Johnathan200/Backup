from neuralintents import GenericAssistant
import speech_recognition
import pyttsx3 as tts
import sys
errmsg = "What the heck happened here??"
msg = "It worked... I guess???"
x = 15
y = 20
def checker() :
    if x < y :
        try:
            print(msg)
        except NameError:
            print(errmsg)   
    else:
        print(errmsg)

checker()
