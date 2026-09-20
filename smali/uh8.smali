.class public final Luh8;
.super Llg8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/RevocationBoundService;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Luh8;->e:I

    .line 13
    const-string v1, "com.google.android.gms.auth.api.signin.internal.IRevocationService"

    invoke-direct {p0, v1, v0}, Llg8;-><init>(Ljava/lang/String;I)V

    .line 14
    iput-object p1, p0, Luh8;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxb7;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Luh8;->e:I

    .line 3
    .line 4
    iput-object p1, p0, Luh8;->f:Ljava/lang/Object;

    .line 5
    .line 6
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback"

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, p1, v0}, Llg8;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    return-void
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
.method public final J(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 6

    .line 1
    iget p3, p0, Luh8;->e:I

    .line 2
    .line 3
    iget-object v0, p0, Luh8;->f:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 11
    .line 12
    if-eq p1, v1, :cond_1

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    if-eq p1, p2, :cond_0

    .line 16
    .line 17
    move v1, v2

    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Luh8;->L()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lji8;->I(Landroid/content/Context;)Lji8;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lji8;->J()V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Luh8;->L()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ld47;->a(Landroid/content/Context;)Ld47;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ld47;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->G:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 44
    .line 45
    const/4 p3, 0x0

    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    const-string p2, "defaultGoogleSignInAccount"

    .line 49
    .line 50
    invoke-virtual {p0, p2}, Ld47;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const-string v3, "googleSignInOptions"

    .line 62
    .line 63
    invoke-static {v3, p2}, Ld47;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p0, p2}, Ld47;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 74
    .line 75
    .line 76
    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    move-object p2, p0

    .line 78
    goto :goto_1

    .line 79
    :catch_0
    :cond_3
    :goto_0
    move-object p2, p3

    .line 80
    :cond_4
    :goto_1
    new-instance p0, Lyf3;

    .line 81
    .line 82
    invoke-static {p2}, Lz65;->k(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, Lg22;

    .line 86
    .line 87
    const/16 v4, 0x14

    .line 88
    .line 89
    invoke-direct {v3, v4}, Lg22;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    new-instance v5, Ljw2;

    .line 97
    .line 98
    invoke-direct {v5, v3, v4}, Ljw2;-><init>(Lg22;Landroid/os/Looper;)V

    .line 99
    .line 100
    .line 101
    sget-object v3, Lvu;->a:Lqc3;

    .line 102
    .line 103
    invoke-direct {p0, v0, v3, p2, v5}, Lkw2;-><init>(Landroid/content/Context;Lqc3;Lym;Ljw2;)V

    .line 104
    .line 105
    .line 106
    const/16 p2, 0xf

    .line 107
    .line 108
    const/4 v0, 0x3

    .line 109
    iget-object v3, p0, Lkw2;->a:Landroid/content/Context;

    .line 110
    .line 111
    iget-object v4, p0, Lkw2;->i:Lpg8;

    .line 112
    .line 113
    if-eqz p1, :cond_9

    .line 114
    .line 115
    invoke-virtual {p0}, Lyf3;->d()I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-ne p0, v0, :cond_5

    .line 120
    .line 121
    move v2, v1

    .line 122
    :cond_5
    sget-object p0, Lii8;->a:Lig;

    .line 123
    .line 124
    iget p1, p0, Lig;->b:I

    .line 125
    .line 126
    if-gt p1, v0, :cond_6

    .line 127
    .line 128
    iget-object p1, p0, Lig;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p1, Ljava/lang/String;

    .line 131
    .line 132
    iget-object p0, p0, Lig;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p0, Ljava/lang/String;

    .line 135
    .line 136
    const-string v0, "Revoking access"

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    :cond_6
    invoke-static {v3}, Ld47;->a(Landroid/content/Context;)Ld47;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    const-string p1, "refreshToken"

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Ld47;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {v3}, Lii8;->a(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    if-eqz v2, :cond_8

    .line 159
    .line 160
    if-nez p0, :cond_7

    .line 161
    .line 162
    sget-object p0, Lzh8;->y:Lig;

    .line 163
    .line 164
    new-instance p0, Lcom/google/android/gms/common/api/Status;

    .line 165
    .line 166
    const/4 p1, 0x4

    .line 167
    invoke-direct {p0, p1, p3, p3, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lm11;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->f()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    xor-int/2addr p1, v1

    .line 175
    const-string p3, "Status code must not be SUCCESS"

    .line 176
    .line 177
    invoke-static {p3, p1}, Lz65;->e(Ljava/lang/String;Z)V

    .line 178
    .line 179
    .line 180
    new-instance p1, Lzg8;

    .line 181
    .line 182
    invoke-direct {p1, p0}, Lzg8;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Lp66;)V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_7
    new-instance p1, Lzh8;

    .line 190
    .line 191
    invoke-direct {p1, p0}, Lzh8;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    new-instance p0, Ljava/lang/Thread;

    .line 195
    .line 196
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 200
    .line 201
    .line 202
    iget-object p1, p1, Lzh8;->x:Lx37;

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_8
    new-instance p1, Lhi8;

    .line 206
    .line 207
    invoke-direct {p1, v4, v1}, Lhi8;-><init>(Lpg8;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, p1}, Lpg8;->a(Lhi8;)Lhi8;

    .line 211
    .line 212
    .line 213
    :goto_2
    new-instance p0, Ltz2;

    .line 214
    .line 215
    invoke-direct {p0, p2}, Ltz2;-><init>(I)V

    .line 216
    .line 217
    .line 218
    new-instance p2, Lxb7;

    .line 219
    .line 220
    invoke-direct {p2}, Lxb7;-><init>()V

    .line 221
    .line 222
    .line 223
    new-instance p3, Lqh8;

    .line 224
    .line 225
    invoke-direct {p3, p1, p2, p0}, Lqh8;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;Lxb7;Ltz2;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a(Lqh8;)V

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_9
    invoke-virtual {p0}, Lyf3;->d()I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    if-ne p0, v0, :cond_a

    .line 237
    .line 238
    move p0, v1

    .line 239
    goto :goto_3

    .line 240
    :cond_a
    move p0, v2

    .line 241
    :goto_3
    sget-object p1, Lii8;->a:Lig;

    .line 242
    .line 243
    iget p3, p1, Lig;->b:I

    .line 244
    .line 245
    if-gt p3, v0, :cond_b

    .line 246
    .line 247
    iget-object p3, p1, Lig;->c:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p3, Ljava/lang/String;

    .line 250
    .line 251
    iget-object p1, p1, Lig;->d:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast p1, Ljava/lang/String;

    .line 254
    .line 255
    const-string v0, "Signing out"

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-static {p3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    :cond_b
    invoke-static {v3}, Lii8;->a(Landroid/content/Context;)V

    .line 265
    .line 266
    .line 267
    if-eqz p0, :cond_c

    .line 268
    .line 269
    new-instance p0, Lx37;

    .line 270
    .line 271
    invoke-direct {p0, v4}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lpg8;)V

    .line 272
    .line 273
    .line 274
    sget-object p1, Lcom/google/android/gms/common/api/Status;->A:Lcom/google/android/gms/common/api/Status;

    .line 275
    .line 276
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->e(Lp66;)V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_c
    new-instance p0, Lhi8;

    .line 281
    .line 282
    invoke-direct {p0, v4, v2}, Lhi8;-><init>(Lpg8;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4, p0}, Lpg8;->a(Lhi8;)Lhi8;

    .line 286
    .line 287
    .line 288
    :goto_4
    new-instance p1, Ltz2;

    .line 289
    .line 290
    invoke-direct {p1, p2}, Ltz2;-><init>(I)V

    .line 291
    .line 292
    .line 293
    new-instance p2, Lxb7;

    .line 294
    .line 295
    invoke-direct {p2}, Lxb7;-><init>()V

    .line 296
    .line 297
    .line 298
    new-instance p3, Lqh8;

    .line 299
    .line 300
    invoke-direct {p3, p0, p2, p1}, Lqh8;-><init>(Lcom/google/android/gms/common/api/internal/BasePendingResult;Lxb7;Ltz2;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0, p3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a(Lqh8;)V

    .line 304
    .line 305
    .line 306
    :goto_5
    return v1

    .line 307
    :pswitch_0
    if-ne p1, v1, :cond_d

    .line 308
    .line 309
    sget-object p0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 310
    .line 311
    invoke-static {p2, p0}, Lbi8;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    check-cast p0, Lcom/google/android/gms/common/api/Status;

    .line 316
    .line 317
    sget-object p1, Lc80;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 318
    .line 319
    invoke-static {p2, p1}, Lbi8;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    check-cast p1, Lc80;

    .line 324
    .line 325
    invoke-static {p2}, Lbi8;->b(Landroid/os/Parcel;)V

    .line 326
    .line 327
    .line 328
    check-cast v0, Lxb7;

    .line 329
    .line 330
    invoke-static {p0, p1, v0}, La35;->m(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lxb7;)V

    .line 331
    .line 332
    .line 333
    goto :goto_6

    .line 334
    :cond_d
    move v1, v2

    .line 335
    :goto_6
    return v1

    .line 336
    nop

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public L()V
    .locals 3

    .line 1
    iget-object p0, p0, Luh8;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p0, v0}, Ll55;->p(Landroid/content/Context;I)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/SecurityException;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v1, "Calling UID "

    .line 23
    .line 24
    const-string v2, " is not Google Play services."

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {p0, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0
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
