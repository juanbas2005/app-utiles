.class public final Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "settings"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static volatile e:Ljava/lang/String;

.field public static volatile f:Z

.field public static volatile g:Z


# instance fields
.field public volatile a:Z

.field public final b:Ljava/lang/Object;

.field public c:Lvp6;

.field public d:Ln78;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->a:Z

    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string p0, "display_name"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    sget-object v0, Landroid/provider/ContactsContract$PhoneLookup;->CONTENT_FILTER_URI:Landroid/net/Uri;

    .line 5
    .line 6
    invoke-static {p2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {v0, p2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    filled-new-array {p0}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-interface {p1, p0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-interface {p1, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p0, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    move-object p0, v1

    .line 50
    :goto_0
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    move-object p0, v0

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 58
    :catchall_2
    move-exception v0

    .line 59
    move-object p2, v0

    .line 60
    :try_start_4
    invoke-static {p1, p0}, Led1;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 64
    :cond_1
    move-object p0, v1

    .line 65
    goto :goto_3

    .line 66
    :goto_2
    new-instance p1, Lm66;

    .line 67
    .line 68
    invoke-direct {p1, p0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object p0, p1

    .line 72
    :goto_3
    nop

    .line 73
    instance-of p1, p0, Lm66;

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_2
    move-object v1, p0

    .line 79
    :goto_4
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    return-object v1
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

.method public static final b(Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    const p0, 0x7f11007a

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const-string v1, "CallAlertChannel"

    .line 6
    .line 7
    const v2, 0x7f11007b

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1, v2, p0, v0}, Lsg3;->p(Landroid/content/Context;Ljava/lang/String;III)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertActivity;->R:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    new-instance p0, Landroid/content/Intent;

    .line 16
    .line 17
    const-class v0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertActivity;

    .line 18
    .line 19
    invoke-direct {p0, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    const/high16 v0, 0x10000000

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, "caller_number"

    .line 29
    .line 30
    invoke-virtual {p0, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "contact_name"

    .line 35
    .line 36
    invoke-virtual {p0, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v0, "is_revertida"

    .line 41
    .line 42
    invoke-virtual {p0, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/high16 v0, 0xc000000

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-static {p1, v2, p0, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-eqz p4, :cond_0

    .line 57
    .line 58
    const p4, 0x7f110080

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const p4, 0x7f11007f

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    :goto_0
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    if-eqz p3, :cond_1

    .line 77
    .line 78
    const-string v0, " \u2022 "

    .line 79
    .line 80
    invoke-static {p3, v0, p2}, Lpb4;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    :cond_1
    new-instance p3, Ld15;

    .line 85
    .line 86
    invoke-direct {p3, p1, v1}, Ld15;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 94
    .line 95
    iget-object v1, p3, Ld15;->y:Landroid/app/Notification;

    .line 96
    .line 97
    iput v0, v1, Landroid/app/Notification;->icon:I

    .line 98
    .line 99
    invoke-static {p4}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    iput-object p4, p3, Ld15;->e:Ljava/lang/CharSequence;

    .line 104
    .line 105
    invoke-static {p2}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iput-object p2, p3, Ld15;->f:Ljava/lang/CharSequence;

    .line 110
    .line 111
    const/4 p2, 0x1

    .line 112
    iput p2, p3, Ld15;->k:I

    .line 113
    .line 114
    const-string p4, "call"

    .line 115
    .line 116
    iput-object p4, p3, Ld15;->q:Ljava/lang/String;

    .line 117
    .line 118
    const/16 p4, 0x10

    .line 119
    .line 120
    invoke-virtual {p3, p4, p2}, Ld15;->c(IZ)V

    .line 121
    .line 122
    .line 123
    iput-object p0, p3, Ld15;->g:Landroid/app/PendingIntent;

    .line 124
    .line 125
    iput-object p0, p3, Ld15;->h:Landroid/app/PendingIntent;

    .line 126
    .line 127
    const/16 p0, 0x80

    .line 128
    .line 129
    invoke-virtual {p3, p0, p2}, Ld15;->c(IZ)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3}, Ld15;->a()Landroid/app/Notification;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const p2, 0x31774

    .line 140
    .line 141
    .line 142
    invoke-static {p1, p2, p0}, Lsg3;->W(Landroid/content/Context;ILandroid/app/Notification;)V

    .line 143
    .line 144
    .line 145
    return-void
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
.end method


# virtual methods
.method public final c(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-boolean p2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->a:Z

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget-object p2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter p2

    .line 8
    :try_start_0
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->a:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lb96;->u(Landroid/content/Context;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lji0;

    .line 17
    .line 18
    check-cast p1, Lvd1;

    .line 19
    .line 20
    iget-object v0, p1, Lvd1;->x:Llu5;

    .line 21
    .line 22
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lvp6;

    .line 27
    .line 28
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->c:Lvp6;

    .line 29
    .line 30
    iget-object p1, p1, Lvd1;->r:Llu5;

    .line 31
    .line 32
    invoke-interface {p1}, Lmu5;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ln78;

    .line 37
    .line 38
    iput-object p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->d:Ln78;

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->a:Z

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    monitor-exit p2

    .line 47
    return-void

    .line 48
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p0

    .line 50
    :cond_1
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
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
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    .line 1
    invoke-virtual {p0, p1, p2}, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->c(Landroid/content/Context;Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "android.intent.action.PHONE_STATE"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string v0, "state"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Landroid/telephony/TelephonyManager;->EXTRA_STATE_RINGING:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    sput-boolean v3, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->g:Z

    .line 40
    .line 41
    sget-object v0, Lfi0;->d:Ld37;

    .line 42
    .line 43
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    const-string v0, "incoming_number"

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    invoke-static {v4}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    sput-object v4, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->e:Ljava/lang/String;

    .line 67
    .line 68
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    sget-object p2, Law1;->a:Ldn1;

    .line 73
    .line 74
    sget-object p2, Lcm1;->y:Lcm1;

    .line 75
    .line 76
    invoke-static {p2}, Lgl0;->E(Le81;)Lig0;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    new-instance v3, Lf7;

    .line 81
    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x2

    .line 84
    move-object v5, p0

    .line 85
    move-object v6, p1

    .line 86
    invoke-direct/range {v3 .. v9}, Lf7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x3

    .line 90
    invoke-static {p2, v2, v2, v3, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    move-object v6, p1

    .line 95
    sget-object p0, Landroid/telephony/TelephonyManager;->EXTRA_STATE_OFFHOOK:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v0, p0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    const p1, 0x31774

    .line 102
    .line 103
    .line 104
    if-eqz p0, :cond_5

    .line 105
    .line 106
    const/4 p0, 0x1

    .line 107
    sput-boolean p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->g:Z

    .line 108
    .line 109
    sput-object v2, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->e:Ljava/lang/String;

    .line 110
    .line 111
    sput-boolean v3, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->f:Z

    .line 112
    .line 113
    sget-object p0, Lfi0;->a:Lfi0;

    .line 114
    .line 115
    sget-object p0, Lfi0;->b:Landroid/os/Handler;

    .line 116
    .line 117
    new-instance p2, Lka;

    .line 118
    .line 119
    const/4 v0, 0x2

    .line 120
    invoke-direct {p2, v0}, Lka;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 124
    .line 125
    .line 126
    sget-object p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertActivity;->R:Ljava/lang/ref/WeakReference;

    .line 127
    .line 128
    if-eqz p0, :cond_4

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertActivity;

    .line 135
    .line 136
    if-eqz p0, :cond_4

    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 139
    .line 140
    .line 141
    :cond_4
    new-instance p0, Ll15;

    .line 142
    .line 143
    invoke-direct {p0, v6}, Ll15;-><init>(Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    iget-object p0, p0, Ll15;->a:Landroid/app/NotificationManager;

    .line 147
    .line 148
    invoke-virtual {p0, v2, p1}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_5
    sput-boolean v3, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->g:Z

    .line 153
    .line 154
    sput-object v2, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->e:Ljava/lang/String;

    .line 155
    .line 156
    sput-boolean v3, Lcu/lestebang/utiletecsa/feature/settings/service/CallAlertReceiver;->f:Z

    .line 157
    .line 158
    sget-object p0, Lfi0;->d:Ld37;

    .line 159
    .line 160
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v2, p2}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    new-instance p0, Ll15;

    .line 169
    .line 170
    invoke-direct {p0, v6}, Ll15;-><init>(Landroid/content/Context;)V

    .line 171
    .line 172
    .line 173
    iget-object p0, p0, Ll15;->a:Landroid/app/NotificationManager;

    .line 174
    .line 175
    invoke-virtual {p0, v2, p1}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    return-void
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method
