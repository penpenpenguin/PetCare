package com.example.petcare.ui.home.video


// Solace PubSub+ Broker Options

// Fill in your Solace Cloud PubSub+ Broker's 'MQTT Host' and 'Password' options.
// This information can be found under:
// https://console.solace.cloud/services/ -> <your-service> -> 'Connect' -> 'MQTT'
//const val SOLACE_CLIENT_USER_NAME = "cc"
//const val SOLACE_CLIENT_PASSWORD = "ccccc"
// 隱藏起來 自己設
const val SOLACE_MQTT_HOST = ""

// Other options
const val SOLACE_CONNECTION_TIMEOUT = 3
const val SOLACE_CONNECTION_KEEP_ALIVE_INTERVAL = 60
const val SOLACE_CONNECTION_CLEAN_SESSION = true
const val SOLACE_CONNECTION_RECONNECT = true