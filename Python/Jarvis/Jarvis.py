from typing import Mapping
from neuralintents import GenericAssistant
import speech_recognition
import pyttsx3 as tts

wrkmsg = "Good morning Sir"
recognizer = speech_recognition.Recognizer()

speaker= tts.init()

speaker.setProperty('rate', 150) 
speaker.say( "Jarvis is online and running")
speaker.say( "Current version Jarvis 1 point O")
speaker.say(wrkmsg)
speaker.runAndWait()

def DotheJob():
        global recognizer
        
        speaker.runAndWait()

        queryComplete = False
        
        while not queryComplete:
          
            try:
                    with speech_recognition.Microphone() as mic: 
                        recognizer.adjust_for_ambient_noise(mic, duration = 0.8)
                        audio = recognizer.listen(mic)
                        
                        job = recognizer.recognize_google(audio)
                        job = job.lower()
                        print(job)
                        

                        queryComplete = True
            except speech_recognition.UnknownValueError:
                    recognizer =  speech_recognition.Recognizer()
                    speaker.say("What?")
                    speaker.runAndWait(0.1)

DotheJob()
speaker.say("What?")

def Job():
        
        print(DotheJob)


assistant = GenericAssistant('intents.json')
assistant.train_model()
