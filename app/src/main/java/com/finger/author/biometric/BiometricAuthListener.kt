package com.finger.author.biometric

import androidx.biometric.BiometricPrompt

/**
 * Created by hvngoc on 10/26/22
 */
interface BiometricAuthListener {
    fun onBiometricAuthenticationSuccess(result: BiometricPrompt.AuthenticationResult)
    fun onBiometricAuthenticationError(errorCode: Int, errorMessage: String)
}