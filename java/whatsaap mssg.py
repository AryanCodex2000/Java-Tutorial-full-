import pywhatkit
from datetime import datetime
import pytz

def send_scheduled_whatsapp_message(phone_number, message, hour, minute):
    india_tz = pytz.timezone('Asia/Kolkata')
    now = datetime.now(india_tz)
    print(f"Current IST time: {now.strftime('%H:%M')}")
    print(f"Scheduling message to {phone_number} at {hour}:{minute:02d}")
    
    # The scheduled time must be at least 1-2 minutes ahead of current time
    pywhatkit.sendwhatmsg(phone_number, message, hour, minute)

if __name__ == "__main__":
    phone = "+918240121894"      # Recipient phone number with country code
    msg = "Happy Birthday Sir! May God Bless You and your dreams come true this year and also you may encounter many opportunities this year!"             # Message to send
    send_hour = 0               # Scheduled hour (24-hour format)
    send_minute = 1
    # Scheduled minute

    send_scheduled_whatsapp_message(phone, msg, send_hour, send_minute)
