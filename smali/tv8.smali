.class public final Ltv8;
.super Ltw8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic A:I

.field public final synthetic B:Ljava/lang/Object;

.field public final synthetic C:Ljava/lang/Object;

.field public final synthetic D:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyw8;Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltv8;->A:I

    .line 21
    iput-object p2, p0, Ltv8;->C:Ljava/lang/Object;

    iput-object p3, p0, Ltv8;->D:Ljava/lang/Object;

    iput-object p1, p0, Ltv8;->B:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 22
    invoke-direct {p0, p1, p2}, Ltw8;-><init>(Lyw8;Z)V

    return-void
.end method

.method public constructor <init>(Lyw8;Ljava/lang/String;Lxt8;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ltv8;->A:I

    .line 23
    iput-object p2, p0, Ltv8;->C:Ljava/lang/Object;

    iput-object p3, p0, Ltv8;->D:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ltv8;->B:Ljava/lang/Object;

    .line 24
    invoke-direct {p0, p1, v0}, Ltw8;-><init>(Lyw8;Z)V

    return-void
.end method

.method public constructor <init>(Lzb2;Landroid/app/Activity;Lxt8;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ltv8;->A:I

    .line 3
    .line 4
    iput-object p2, p0, Ltv8;->C:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Ltv8;->D:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Ltv8;->B:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p1, p1, Lzb2;->x:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lyw8;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-direct {p0, p1, p2}, Ltw8;-><init>(Lyw8;Z)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method

.method public constructor <init>(Lzb2;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ltv8;->A:I

    .line 19
    iput-object p2, p0, Ltv8;->D:Ljava/lang/Object;

    iput-object p3, p0, Ltv8;->C:Ljava/lang/Object;

    iput-object p1, p0, Ltv8;->B:Ljava/lang/Object;

    iget-object p1, p1, Lzb2;->x:Ljava/lang/Object;

    check-cast p1, Lyw8;

    const/4 p2, 0x1

    .line 20
    invoke-direct {p0, p1, p2}, Ltw8;-><init>(Lyw8;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ltv8;->A:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, Ltv8;->B:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lzb2;

    .line 12
    .line 13
    iget-object v0, v0, Lzb2;->x:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lyw8;

    .line 16
    .line 17
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 18
    .line 19
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, v1, Ltv8;->C:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Landroid/app/Activity;

    .line 25
    .line 26
    invoke-static {v2}, Ljv8;->f(Landroid/app/Activity;)Ljv8;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v3, v1, Ltv8;->D:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Lxt8;

    .line 33
    .line 34
    iget-wide v4, v1, Ltw8;->x:J

    .line 35
    .line 36
    invoke-interface {v0, v2, v3, v4, v5}, Lcu8;->onActivitySaveInstanceStateByScionActivityInfo(Ljv8;Lju8;J)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    iget-object v0, v1, Ltv8;->D:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroid/os/Bundle;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    new-instance v2, Landroid/os/Bundle;

    .line 47
    .line 48
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v3, "com.google.app_measurement.screen_service"

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    instance-of v4, v0, Landroid/os/Bundle;

    .line 64
    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    check-cast v0, Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    iget-object v0, v1, Ltv8;->B:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lzb2;

    .line 75
    .line 76
    iget-object v0, v0, Lzb2;->x:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lyw8;

    .line 79
    .line 80
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 81
    .line 82
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v3, v1, Ltv8;->C:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Landroid/app/Activity;

    .line 88
    .line 89
    iget-wide v4, v1, Ltw8;->x:J

    .line 90
    .line 91
    invoke-static {v3}, Ljv8;->f(Landroid/app/Activity;)Ljv8;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v0, v1, v2, v4, v5}, Lcu8;->onActivityCreatedByScionActivityInfo(Ljv8;Landroid/os/Bundle;J)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_1
    iget-object v0, v1, Ltv8;->B:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lyw8;

    .line 102
    .line 103
    iget-object v0, v0, Lyw8;->f:Lcu8;

    .line 104
    .line 105
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v2, v1, Ltv8;->C:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    iget-object v1, v1, Ltv8;->D:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Lxt8;

    .line 115
    .line 116
    invoke-interface {v0, v2, v1}, Lcu8;->getMaxUserProperties(Ljava/lang/String;Lju8;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_2
    const/4 v3, 0x0

    .line 121
    const/4 v4, 0x1

    .line 122
    :try_start_0
    iget-object v0, v1, Ltv8;->C:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v5, v0

    .line 125
    check-cast v5, Landroid/content/Context;

    .line 126
    .line 127
    invoke-static {v5}, Lz65;->k(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v5}, Ljb5;->J(Landroid/content/Context;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-eqz v7, :cond_1

    .line 143
    .line 144
    invoke-static {v5}, Ljb5;->J(Landroid/content/Context;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    goto :goto_0

    .line 149
    :catch_0
    move-exception v0

    .line 150
    goto/16 :goto_8

    .line 151
    .line 152
    :cond_1
    :goto_0
    const-string v7, "google_analytics_force_disable_updates"

    .line 153
    .line 154
    const-string v8, "bool"

    .line 155
    .line 156
    invoke-virtual {v6, v7, v8, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    if-nez v0, :cond_2

    .line 161
    .line 162
    :catch_1
    move-object v6, v2

    .line 163
    goto :goto_1

    .line 164
    :cond_2
    :try_start_1
    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object v0
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 172
    move-object v6, v0

    .line 173
    :goto_1
    :try_start_2
    iget-object v0, v1, Ltv8;->B:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v7, v0

    .line 176
    check-cast v7, Lyw8;

    .line 177
    .line 178
    if-eqz v6, :cond_3

    .line 179
    .line 180
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_4

    .line 185
    .line 186
    :cond_3
    move v0, v4

    .line 187
    goto :goto_2

    .line 188
    :cond_4
    move v0, v3

    .line 189
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 190
    .line 191
    .line 192
    const-string v8, "com.google.android.gms.measurement.dynamite"

    .line 193
    .line 194
    if-eqz v0, :cond_5

    .line 195
    .line 196
    :try_start_3
    sget-object v0, Lf12;->c:Lrx8;

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :catch_2
    move-exception v0

    .line 200
    goto :goto_4

    .line 201
    :cond_5
    sget-object v0, Lf12;->b:Lpx8;

    .line 202
    .line 203
    :goto_3
    invoke-static {v5, v0, v8}, Lf12;->c(Landroid/content/Context;Le12;Ljava/lang/String;)Lf12;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v9, "com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"

    .line 208
    .line 209
    invoke-virtual {v0, v9}, Lf12;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, Lbu8;->asInterface(Landroid/os/IBinder;)Lcu8;

    .line 214
    .line 215
    .line 216
    move-result-object v2
    :try_end_3
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 217
    goto :goto_5

    .line 218
    :goto_4
    :try_start_4
    invoke-virtual {v7, v0, v4, v3}, Lyw8;->d(Ljava/lang/Exception;ZZ)V

    .line 219
    .line 220
    .line 221
    :goto_5
    iput-object v2, v7, Lyw8;->f:Lcu8;

    .line 222
    .line 223
    iget-object v0, v7, Lyw8;->f:Lcu8;

    .line 224
    .line 225
    if-nez v0, :cond_6

    .line 226
    .line 227
    const-string v0, "FA"

    .line 228
    .line 229
    const-string v2, "Failed to connect to measurement client."

    .line 230
    .line 231
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    goto/16 :goto_9

    .line 235
    .line 236
    :cond_6
    invoke-static {v5, v8}, Lf12;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    invoke-static {v5, v8, v3}, Lf12;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {v9, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-nez v6, :cond_7

    .line 255
    .line 256
    if-ge v2, v0, :cond_8

    .line 257
    .line 258
    :cond_7
    move v14, v4

    .line 259
    goto :goto_6

    .line 260
    :cond_8
    move v14, v3

    .line 261
    :goto_6
    int-to-long v12, v8

    .line 262
    iput-wide v12, v7, Lyw8;->g:J

    .line 263
    .line 264
    new-instance v17, Liv8;

    .line 265
    .line 266
    iget-object v0, v1, Ltv8;->D:Ljava/lang/Object;

    .line 267
    .line 268
    move-object v15, v0

    .line 269
    check-cast v15, Landroid/os/Bundle;

    .line 270
    .line 271
    invoke-static {v5}, Ljb5;->J(Landroid/content/Context;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v16

    .line 275
    const-wide/32 v10, 0x274e8

    .line 276
    .line 277
    .line 278
    move-object/from16 v9, v17

    .line 279
    .line 280
    invoke-direct/range {v9 .. v16}, Liv8;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    iget-wide v8, v7, Lyw8;->g:J
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 284
    .line 285
    const-wide/16 v10, 0xa9

    .line 286
    .line 287
    cmp-long v0, v8, v10

    .line 288
    .line 289
    if-ltz v0, :cond_9

    .line 290
    .line 291
    move v0, v4

    .line 292
    goto :goto_7

    .line 293
    :cond_9
    move v0, v3

    .line 294
    :goto_7
    iget-object v15, v7, Lyw8;->f:Lcu8;

    .line 295
    .line 296
    if-eqz v0, :cond_a

    .line 297
    .line 298
    :try_start_5
    invoke-static {v15}, Lz65;->k(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    new-instance v0, Lz25;

    .line 302
    .line 303
    invoke-direct {v0, v5}, Lz25;-><init>(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    iget-wide v5, v1, Ltw8;->w:J

    .line 307
    .line 308
    iget-wide v7, v1, Ltw8;->x:J

    .line 309
    .line 310
    move-object/from16 v16, v0

    .line 311
    .line 312
    move-wide/from16 v18, v5

    .line 313
    .line 314
    move-wide/from16 v20, v7

    .line 315
    .line 316
    invoke-interface/range {v15 .. v21}, Lcu8;->initializeWithElapsedTime(Ly73;Liv8;JJ)V

    .line 317
    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_a
    move-object/from16 v9, v17

    .line 321
    .line 322
    invoke-static {v15}, Lz65;->k(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    new-instance v0, Lz25;

    .line 326
    .line 327
    invoke-direct {v0, v5}, Lz25;-><init>(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iget-wide v5, v1, Ltw8;->w:J

    .line 331
    .line 332
    invoke-interface {v15, v0, v9, v5, v6}, Lcu8;->initialize(Ly73;Liv8;J)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 333
    .line 334
    .line 335
    goto :goto_9

    .line 336
    :goto_8
    iget-object v1, v1, Ltv8;->B:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v1, Lyw8;

    .line 339
    .line 340
    invoke-virtual {v1, v0, v4, v3}, Lyw8;->d(Ljava/lang/Exception;ZZ)V

    .line 341
    .line 342
    .line 343
    :goto_9
    return-void

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public b()V
    .locals 1

    .line 1
    iget v0, p0, Ltv8;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Ltv8;->D:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lxt8;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Lxt8;->z(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 18
    .line 19
    .line 20
    .line 21
.end method
