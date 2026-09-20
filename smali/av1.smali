.class public final Lav1;
.super Ljb1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    packed-switch p3, :pswitch_data_0

    .line 3
    .line 4
    .line 5
    const-string p3, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL"

    .line 6
    .line 7
    invoke-direct {p0, p3, p2}, Ljb1;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    :try_start_0
    new-instance p0, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    :cond_0
    const-string p0, "credentialJson must not be empty, and must be a valid JSON"

    .line 23
    .line 24
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :pswitch_0
    const-string p3, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"

    .line 29
    .line 30
    invoke-direct {p0, p3, p2}, Ljb1;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    :try_start_1
    new-instance p0, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_1
    :cond_1
    const-string p0, "authenticationResponseJson must not be empty, and must be a valid JSON"

    .line 46
    .line 47
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :pswitch_1
    const-string p3, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    .line 52
    .line 53
    invoke-direct {p0, p3, p2}, Ljb1;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-lez p0, :cond_2

    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    const-string p0, "password should not be empty"

    .line 64
    .line 65
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method
