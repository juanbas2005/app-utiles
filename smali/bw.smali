.class public final Lbw;
.super Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:Lew;


# direct methods
.method public constructor <init>(Lew;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbw;->a:Lew;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public onAuthenticationError(ILjava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lbw;->a:Lew;

    .line 2
    .line 3
    check-cast p0, Ld90;

    .line 4
    .line 5
    iget-object p0, p0, Ld90;->a:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lf90;

    .line 18
    .line 19
    iget-boolean v0, v0, Lf90;->l:Z

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lf90;

    .line 28
    .line 29
    iget-boolean v0, v0, Lf90;->k:Z

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lf90;

    .line 38
    .line 39
    new-instance v0, Lo80;

    .line 40
    .line 41
    invoke-direct {v0, p1, p2}, Lo80;-><init>(ILjava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lf90;->f(Lo80;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public onAuthenticationFailed()V
    .locals 1

    .line 1
    iget-object p0, p0, Lbw;->a:Lew;

    .line 2
    .line 3
    check-cast p0, Ld90;

    .line 4
    .line 5
    iget-object p0, p0, Ld90;->a:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lf90;

    .line 18
    .line 19
    iget-boolean v0, v0, Lf90;->k:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lf90;

    .line 28
    .line 29
    iget-object v0, p0, Lf90;->s:Lbp4;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lbp4;

    .line 34
    .line 35
    invoke-direct {v0}, Lbp4;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lf90;->s:Lbp4;

    .line 39
    .line 40
    :cond_0
    iget-object p0, p0, Lf90;->s:Lbp4;

    .line 41
    .line 42
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-static {p0, v0}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public onAuthenticationHelp(ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public onAuthenticationSucceeded(Landroid/hardware/biometrics/BiometricPrompt$AuthenticationResult;)V
    .locals 4

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    invoke-static {p1}, Lcw;->b(Landroid/hardware/biometrics/BiometricPrompt$AuthenticationResult;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v1}, Lkc1;->d(Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;)Ljavax/crypto/Cipher;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {v1}, Lkc1;->f(Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;)Ljava/security/Signature;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    invoke-static {v1}, Lkc1;->e(Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;)Ljavax/crypto/Mac;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    if-lt v2, v0, :cond_4

    .line 36
    .line 37
    invoke-static {v1}, Llc1;->b(Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;)Landroid/security/identity/IdentityCredential;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    const/16 v3, 0x21

    .line 45
    .line 46
    if-lt v2, v3, :cond_5

    .line 47
    .line 48
    invoke-static {v1}, Lmc1;->b(Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;)Landroid/security/identity/PresentationSession;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_5
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const/4 v2, -0x1

    .line 55
    if-lt v1, v0, :cond_6

    .line 56
    .line 57
    if-eqz p1, :cond_7

    .line 58
    .line 59
    invoke-static {p1}, Ldw;->a(Landroid/hardware/biometrics/BiometricPrompt$AuthenticationResult;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    goto :goto_1

    .line 64
    :cond_6
    const/16 p1, 0x1d

    .line 65
    .line 66
    if-ne v1, p1, :cond_8

    .line 67
    .line 68
    :cond_7
    move p1, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_8
    const/4 p1, 0x2

    .line 71
    :goto_1
    new-instance v0, Lb90;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, Lbw;->a:Lew;

    .line 77
    .line 78
    check-cast p0, Ld90;

    .line 79
    .line 80
    iget-object p0, p0, Ld90;->a:Ljava/lang/ref/WeakReference;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eqz v1, :cond_b

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lf90;

    .line 93
    .line 94
    iget-boolean v1, v1, Lf90;->k:Z

    .line 95
    .line 96
    if-eqz v1, :cond_b

    .line 97
    .line 98
    if-ne p1, v2, :cond_9

    .line 99
    .line 100
    new-instance v0, Lb90;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Lf90;

    .line 107
    .line 108
    invoke-virtual {p1}, Lf90;->e()I

    .line 109
    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    :cond_9
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Lf90;

    .line 119
    .line 120
    iget-object p1, p0, Lf90;->p:Lbp4;

    .line 121
    .line 122
    if-nez p1, :cond_a

    .line 123
    .line 124
    new-instance p1, Lbp4;

    .line 125
    .line 126
    invoke-direct {p1}, Lbp4;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lf90;->p:Lbp4;

    .line 130
    .line 131
    :cond_a
    iget-object p0, p0, Lf90;->p:Lbp4;

    .line 132
    .line 133
    invoke-static {p0, v0}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_b
    return-void
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
