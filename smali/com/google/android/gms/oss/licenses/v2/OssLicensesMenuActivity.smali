.class public final Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;
.super Lyn;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic X:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyn;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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
.end method

.method public static final t(Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lyn;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const v2, 0x7f090118

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "raw"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 25
    .line 26
    .line 27
    move-result p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-lez p0, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 32
    .line 33
    .line 34
    :catch_0
    return v0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 39
    .line 40
    .line 41
    :catch_1
    :cond_1
    throw p0

    .line 42
    :catch_2
    if-eqz v1, :cond_2

    .line 43
    .line 44
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 45
    .line 46
    .line 47
    :catch_3
    :cond_2
    return v0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Leq2;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Ly12;->b(Lyn;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "title"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Lyn;->s()Lu98;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-boolean v3, v0, Lu98;->p:Z

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    iput-boolean v2, v0, Lu98;->p:Z

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lu98;->e(Z)V

    .line 50
    .line 51
    .line 52
    :cond_1
    const-string v0, "third_party_licenses"

    .line 53
    .line 54
    invoke-static {p0, v0}, Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;->t(Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    const-string v0, "third_party_license_metadata"

    .line 61
    .line 62
    invoke-static {p0, v0}, Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;->t(Lcom/google/android/gms/oss/licenses/v2/OssLicensesMenuActivity;Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    move v1, v2

    .line 69
    :cond_2
    new-instance v0, Ldn8;

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    invoke-direct {v0, v3, p1, v1}, Ldn8;-><init>(ILjava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Lfw0;

    .line 76
    .line 77
    const v1, 0x208b8c19

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v1, v0, v2}, Lfw0;-><init>(ILjava/lang/Object;Z)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, p1}, Lsv0;->a(Lrv0;Lfw0;)V

    .line 84
    .line 85
    .line 86
    return-void
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
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
