.class public final Lyx;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyx;->w:I

    .line 2
    .line 3
    iput-object p2, p0, Lyx;->x:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lyx;->w:I

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v2, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget v2, v1, Landroid/os/Message;->what:I

    .line 15
    .line 16
    const-string v7, "Timeout waiting for ServiceConnection callback "

    .line 17
    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    if-eq v2, v4, :cond_0

    .line 21
    .line 22
    move v4, v6

    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    iget-object v0, v0, Lyx;->x:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lg99;

    .line 28
    .line 29
    iget-object v2, v0, Lg99;->a:Ljava/util/HashMap;

    .line 30
    .line 31
    monitor-enter v2

    .line 32
    :try_start_0
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lh69;

    .line 35
    .line 36
    iget-object v0, v0, Lg99;->a:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lk79;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    iget v6, v0, Lk79;->x:I

    .line 47
    .line 48
    if-ne v6, v3, :cond_3

    .line 49
    .line 50
    const-string v3, "GmsClientSupervisor"

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    add-int/lit8 v8, v8, 0x2f

    .line 61
    .line 62
    new-instance v9, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    new-instance v7, Ljava/lang/Exception;

    .line 78
    .line 79
    invoke-direct {v7}, Ljava/lang/Exception;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v3, v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 83
    .line 84
    .line 85
    iget-object v3, v0, Lk79;->B:Landroid/content/ComponentName;

    .line 86
    .line 87
    if-nez v3, :cond_1

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move-object v5, v3

    .line 96
    :goto_0
    if-nez v5, :cond_2

    .line 97
    .line 98
    new-instance v5, Landroid/content/ComponentName;

    .line 99
    .line 100
    iget-object v1, v1, Lh69;->b:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v1}, Lz65;->k(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-string v3, "unknown"

    .line 106
    .line 107
    invoke-direct {v5, v1, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-virtual {v0, v5}, Lk79;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    monitor-exit v2

    .line 114
    goto :goto_3

    .line 115
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    throw v0

    .line 117
    :cond_4
    iget-object v0, v0, Lyx;->x:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lg99;

    .line 120
    .line 121
    iget-object v2, v0, Lg99;->a:Ljava/util/HashMap;

    .line 122
    .line 123
    monitor-enter v2

    .line 124
    :try_start_1
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Lh69;

    .line 127
    .line 128
    iget-object v3, v0, Lg99;->a:Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Lk79;

    .line 135
    .line 136
    if-eqz v3, :cond_6

    .line 137
    .line 138
    iget-object v5, v3, Lk79;->w:Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_6

    .line 145
    .line 146
    iget-boolean v5, v3, Lk79;->y:Z

    .line 147
    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    iget-object v5, v3, Lk79;->A:Lh69;

    .line 151
    .line 152
    iget-object v7, v3, Lk79;->C:Lg99;

    .line 153
    .line 154
    iget-object v8, v7, Lg99;->c:Lph8;

    .line 155
    .line 156
    invoke-virtual {v8, v4, v5}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iget-object v5, v7, Lg99;->d:Lq11;

    .line 160
    .line 161
    iget-object v7, v7, Lg99;->b:Landroid/content/Context;

    .line 162
    .line 163
    invoke-virtual {v5, v7, v3}, Lq11;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 164
    .line 165
    .line 166
    iput-boolean v6, v3, Lk79;->y:Z

    .line 167
    .line 168
    const/4 v5, 0x2

    .line 169
    iput v5, v3, Lk79;->x:I

    .line 170
    .line 171
    :cond_5
    iget-object v0, v0, Lg99;->a:Ljava/util/HashMap;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    goto :goto_4

    .line 179
    :cond_6
    :goto_2
    monitor-exit v2

    .line 180
    :goto_3
    return v4

    .line 181
    :goto_4
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 182
    throw v0

    .line 183
    :pswitch_0
    const-string v2, "MessengerIpcClient"

    .line 184
    .line 185
    const-string v7, "Received response for unknown request: "

    .line 186
    .line 187
    iget v8, v1, Landroid/os/Message;->arg1:I

    .line 188
    .line 189
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_7

    .line 194
    .line 195
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    new-instance v3, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    add-int/lit8 v2, v2, 0x1e

    .line 206
    .line 207
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 208
    .line 209
    .line 210
    const-string v2, "Received response to request: "

    .line 211
    .line 212
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const-string v3, "MessengerIpcClient"

    .line 223
    .line 224
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    :cond_7
    iget-object v0, v0, Lyx;->x:Ljava/lang/Object;

    .line 228
    .line 229
    move-object v2, v0

    .line 230
    check-cast v2, Lr89;

    .line 231
    .line 232
    monitor-enter v2

    .line 233
    :try_start_2
    iget-object v0, v2, Lr89;->A:Landroid/util/SparseArray;

    .line 234
    .line 235
    invoke-virtual {v0, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    check-cast v3, Lba9;

    .line 240
    .line 241
    if-nez v3, :cond_8

    .line 242
    .line 243
    const-string v0, "MessengerIpcClient"

    .line 244
    .line 245
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    add-int/lit8 v1, v1, 0x27

    .line 254
    .line 255
    new-instance v3, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    monitor-exit v2

    .line 274
    goto :goto_5

    .line 275
    :catchall_2
    move-exception v0

    .line 276
    goto :goto_6

    .line 277
    :cond_8
    invoke-virtual {v0, v8}, Landroid/util/SparseArray;->remove(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Lr89;->d()V

    .line 281
    .line 282
    .line 283
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 284
    invoke-virtual {v1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const-string v1, "unsupported"

    .line 289
    .line 290
    invoke-virtual {v0, v1, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_9

    .line 295
    .line 296
    const-string v0, "Not supported by GmsCore"

    .line 297
    .line 298
    new-instance v1, Lcom/google/android/gms/cloudmessaging/zzt;

    .line 299
    .line 300
    invoke-direct {v1, v0, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3, v1}, Lba9;->c(Lcom/google/android/gms/cloudmessaging/zzt;)V

    .line 304
    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_9
    iget v1, v3, Lba9;->e:I

    .line 308
    .line 309
    packed-switch v1, :pswitch_data_1

    .line 310
    .line 311
    .line 312
    const-string v1, "data"

    .line 313
    .line 314
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-nez v0, :cond_a

    .line 319
    .line 320
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 321
    .line 322
    :cond_a
    invoke-virtual {v3, v0}, Lba9;->b(Landroid/os/Bundle;)V

    .line 323
    .line 324
    .line 325
    goto :goto_5

    .line 326
    :pswitch_1
    const-string v1, "ack"

    .line 327
    .line 328
    invoke-virtual {v0, v1, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_b

    .line 333
    .line 334
    invoke-virtual {v3, v5}, Lba9;->b(Landroid/os/Bundle;)V

    .line 335
    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_b
    const-string v0, "Invalid response to one way request"

    .line 339
    .line 340
    new-instance v1, Lcom/google/android/gms/cloudmessaging/zzt;

    .line 341
    .line 342
    invoke-direct {v1, v0, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v1}, Lba9;->c(Lcom/google/android/gms/cloudmessaging/zzt;)V

    .line 346
    .line 347
    .line 348
    :goto_5
    return v4

    .line 349
    :goto_6
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 350
    throw v0

    .line 351
    :pswitch_2
    iget v2, v1, Landroid/os/Message;->what:I

    .line 352
    .line 353
    if-eqz v2, :cond_c

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_c
    iget-object v0, v0, Lyx;->x:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v0, Lb5;

    .line 359
    .line 360
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 361
    .line 362
    if-eqz v1, :cond_d

    .line 363
    .line 364
    invoke-static {}, Lku4;->a()V

    .line 365
    .line 366
    .line 367
    :goto_7
    return v6

    .line 368
    :cond_d
    iget-object v2, v0, Lb5;->a:Ljava/lang/Object;

    .line 369
    .line 370
    monitor-enter v2

    .line 371
    :try_start_4
    throw v5

    .line 372
    :catchall_3
    move-exception v0

    .line 373
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 374
    throw v0

    .line 375
    :pswitch_3
    iget-object v0, v0, Lyx;->x:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Lnz0;

    .line 378
    .line 379
    iget-object v2, v0, Lnz0;->j:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v2, Lwv2;

    .line 382
    .line 383
    iget-object v3, v0, Lnz0;->b:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v3, Lxj0;

    .line 386
    .line 387
    iget v7, v1, Landroid/os/Message;->what:I

    .line 388
    .line 389
    const v8, 0x7f090257

    .line 390
    .line 391
    .line 392
    if-ne v7, v8, :cond_20

    .line 393
    .line 394
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v1, Lry6;

    .line 397
    .line 398
    iget-object v7, v0, Lnz0;->f:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v7, Landroid/os/Handler;

    .line 401
    .line 402
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 403
    .line 404
    .line 405
    move-result-wide v8

    .line 406
    iget-object v10, v0, Lnz0;->g:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v10, Landroid/graphics/Rect;

    .line 409
    .line 410
    iput-object v10, v1, Lry6;->d:Landroid/graphics/Rect;

    .line 411
    .line 412
    iget-object v11, v1, Lry6;->a:Lm90;

    .line 413
    .line 414
    iget v12, v11, Lm90;->b:I

    .line 415
    .line 416
    if-nez v10, :cond_e

    .line 417
    .line 418
    move/from16 v16, v4

    .line 419
    .line 420
    goto/16 :goto_f

    .line 421
    .line 422
    :cond_e
    iget v10, v1, Lry6;->c:I

    .line 423
    .line 424
    iget-object v13, v11, Lm90;->a:[B

    .line 425
    .line 426
    iget v14, v11, Lm90;->c:I

    .line 427
    .line 428
    const/16 v15, 0x5a

    .line 429
    .line 430
    if-eq v10, v15, :cond_14

    .line 431
    .line 432
    const/16 v15, 0xb4

    .line 433
    .line 434
    if-eq v10, v15, :cond_12

    .line 435
    .line 436
    const/16 v15, 0x10e

    .line 437
    .line 438
    if-eq v10, v15, :cond_f

    .line 439
    .line 440
    move/from16 v16, v4

    .line 441
    .line 442
    goto :goto_d

    .line 443
    :cond_f
    new-instance v11, Lm90;

    .line 444
    .line 445
    mul-int v10, v12, v14

    .line 446
    .line 447
    new-array v15, v10, [B

    .line 448
    .line 449
    sub-int/2addr v10, v4

    .line 450
    move/from16 v16, v4

    .line 451
    .line 452
    move v4, v6

    .line 453
    :goto_8
    if-ge v4, v12, :cond_11

    .line 454
    .line 455
    add-int/lit8 v17, v14, -0x1

    .line 456
    .line 457
    :goto_9
    if-ltz v17, :cond_10

    .line 458
    .line 459
    mul-int v18, v17, v12

    .line 460
    .line 461
    add-int v18, v18, v4

    .line 462
    .line 463
    aget-byte v18, v13, v18

    .line 464
    .line 465
    aput-byte v18, v15, v10

    .line 466
    .line 467
    add-int/lit8 v10, v10, -0x1

    .line 468
    .line 469
    add-int/lit8 v17, v17, -0x1

    .line 470
    .line 471
    goto :goto_9

    .line 472
    :cond_10
    add-int/lit8 v4, v4, 0x1

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_11
    invoke-direct {v11, v15, v14, v12}, Lm90;-><init>([BII)V

    .line 476
    .line 477
    .line 478
    goto :goto_d

    .line 479
    :cond_12
    move/from16 v16, v4

    .line 480
    .line 481
    new-instance v11, Lm90;

    .line 482
    .line 483
    mul-int v4, v12, v14

    .line 484
    .line 485
    new-array v10, v4, [B

    .line 486
    .line 487
    add-int/lit8 v15, v4, -0x1

    .line 488
    .line 489
    :goto_a
    if-ge v6, v4, :cond_13

    .line 490
    .line 491
    aget-byte v18, v13, v6

    .line 492
    .line 493
    aput-byte v18, v10, v15

    .line 494
    .line 495
    add-int/lit8 v15, v15, -0x1

    .line 496
    .line 497
    add-int/lit8 v6, v6, 0x1

    .line 498
    .line 499
    goto :goto_a

    .line 500
    :cond_13
    invoke-direct {v11, v10, v12, v14}, Lm90;-><init>([BII)V

    .line 501
    .line 502
    .line 503
    goto :goto_d

    .line 504
    :cond_14
    move/from16 v16, v4

    .line 505
    .line 506
    new-instance v11, Lm90;

    .line 507
    .line 508
    mul-int v4, v12, v14

    .line 509
    .line 510
    new-array v4, v4, [B

    .line 511
    .line 512
    const/4 v6, 0x0

    .line 513
    const/4 v10, 0x0

    .line 514
    :goto_b
    if-ge v6, v12, :cond_16

    .line 515
    .line 516
    add-int/lit8 v15, v14, -0x1

    .line 517
    .line 518
    :goto_c
    if-ltz v15, :cond_15

    .line 519
    .line 520
    mul-int v18, v15, v12

    .line 521
    .line 522
    add-int v18, v18, v6

    .line 523
    .line 524
    aget-byte v18, v13, v18

    .line 525
    .line 526
    aput-byte v18, v4, v10

    .line 527
    .line 528
    add-int/lit8 v10, v10, 0x1

    .line 529
    .line 530
    add-int/lit8 v15, v15, -0x1

    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_15
    add-int/lit8 v6, v6, 0x1

    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_16
    invoke-direct {v11, v4, v14, v12}, Lm90;-><init>([BII)V

    .line 537
    .line 538
    .line 539
    :goto_d
    iget-object v4, v1, Lry6;->d:Landroid/graphics/Rect;

    .line 540
    .line 541
    iget-object v6, v11, Lm90;->a:[B

    .line 542
    .line 543
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 544
    .line 545
    .line 546
    move-result v10

    .line 547
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 548
    .line 549
    .line 550
    move-result v13

    .line 551
    iget v14, v4, Landroid/graphics/Rect;->top:I

    .line 552
    .line 553
    mul-int v15, v10, v13

    .line 554
    .line 555
    new-array v15, v15, [B

    .line 556
    .line 557
    iget v11, v11, Lm90;->b:I

    .line 558
    .line 559
    mul-int/2addr v14, v11

    .line 560
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 561
    .line 562
    add-int/2addr v14, v4

    .line 563
    const/4 v4, 0x0

    .line 564
    :goto_e
    if-ge v4, v13, :cond_17

    .line 565
    .line 566
    mul-int v5, v4, v10

    .line 567
    .line 568
    invoke-static {v6, v14, v15, v5, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 569
    .line 570
    .line 571
    add-int/2addr v14, v11

    .line 572
    add-int/lit8 v4, v4, 0x1

    .line 573
    .line 574
    const/4 v5, 0x0

    .line 575
    goto :goto_e

    .line 576
    :cond_17
    new-instance v18, Lsh5;

    .line 577
    .line 578
    move/from16 v22, v10

    .line 579
    .line 580
    move/from16 v23, v13

    .line 581
    .line 582
    move/from16 v20, v10

    .line 583
    .line 584
    move/from16 v21, v13

    .line 585
    .line 586
    move-object/from16 v19, v15

    .line 587
    .line 588
    invoke-direct/range {v18 .. v23}, Lsh5;-><init>([BIIII)V

    .line 589
    .line 590
    .line 591
    move-object/from16 v5, v18

    .line 592
    .line 593
    :goto_f
    if-eqz v5, :cond_1a

    .line 594
    .line 595
    iget-object v4, v0, Lnz0;->e:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v4, Lnk1;

    .line 598
    .line 599
    invoke-virtual {v4, v5}, Lnk1;->b(Lsh5;)Lqc3;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    iget-object v6, v4, Lnk1;->a:Lmn4;

    .line 604
    .line 605
    iget-object v4, v4, Lnk1;->b:Ljava/util/ArrayList;

    .line 606
    .line 607
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 608
    .line 609
    .line 610
    if-eqz v6, :cond_19

    .line 611
    .line 612
    :try_start_5
    iget-object v4, v6, Lmn4;->b:[Lrw5;

    .line 613
    .line 614
    if-nez v4, :cond_18

    .line 615
    .line 616
    const/4 v4, 0x0

    .line 617
    invoke-virtual {v6, v4}, Lmn4;->c(Ljava/util/Map;)V

    .line 618
    .line 619
    .line 620
    goto :goto_10

    .line 621
    :catchall_4
    move-exception v0

    .line 622
    goto :goto_12

    .line 623
    :cond_18
    :goto_10
    invoke-virtual {v6, v5}, Lmn4;->b(Lqc3;)Ln66;

    .line 624
    .line 625
    .line 626
    move-result-object v5
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 627
    :goto_11
    invoke-virtual {v6}, Lmn4;->reset()V

    .line 628
    .line 629
    .line 630
    goto :goto_15

    .line 631
    :catch_0
    const/4 v4, 0x0

    .line 632
    goto :goto_13

    .line 633
    :cond_19
    const/4 v4, 0x0

    .line 634
    :try_start_6
    invoke-virtual {v6, v4}, Lmn4;->c(Ljava/util/Map;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v6, v5}, Lmn4;->b(Lqc3;)Ln66;

    .line 638
    .line 639
    .line 640
    move-result-object v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 641
    goto :goto_11

    .line 642
    :goto_12
    invoke-virtual {v6}, Lmn4;->reset()V

    .line 643
    .line 644
    .line 645
    throw v0

    .line 646
    :catch_1
    :goto_13
    invoke-virtual {v6}, Lmn4;->reset()V

    .line 647
    .line 648
    .line 649
    goto :goto_14

    .line 650
    :cond_1a
    const/4 v4, 0x0

    .line 651
    :goto_14
    move-object v5, v4

    .line 652
    :goto_15
    if-eqz v5, :cond_1b

    .line 653
    .line 654
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 655
    .line 656
    .line 657
    move-result-wide v10

    .line 658
    const-string v4, "nz0"

    .line 659
    .line 660
    new-instance v6, Ljava/lang/StringBuilder;

    .line 661
    .line 662
    const-string v13, "Found barcode in "

    .line 663
    .line 664
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    sub-long/2addr v10, v8

    .line 668
    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    const-string v8, " ms"

    .line 672
    .line 673
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v6

    .line 680
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 681
    .line 682
    .line 683
    if-eqz v7, :cond_1c

    .line 684
    .line 685
    new-instance v4, Lf50;

    .line 686
    .line 687
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 688
    .line 689
    .line 690
    iput-object v5, v4, Lf50;->a:Ln66;

    .line 691
    .line 692
    iput-object v1, v4, Lf50;->b:Lry6;

    .line 693
    .line 694
    const v5, 0x7f090259

    .line 695
    .line 696
    .line 697
    invoke-static {v7, v5, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    new-instance v5, Landroid/os/Bundle;

    .line 702
    .line 703
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 710
    .line 711
    .line 712
    goto :goto_16

    .line 713
    :cond_1b
    if-eqz v7, :cond_1c

    .line 714
    .line 715
    const v4, 0x7f090258

    .line 716
    .line 717
    .line 718
    invoke-static {v7, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 719
    .line 720
    .line 721
    move-result-object v4

    .line 722
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 723
    .line 724
    .line 725
    :cond_1c
    :goto_16
    if-eqz v7, :cond_1f

    .line 726
    .line 727
    iget-object v0, v0, Lnz0;->e:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v0, Lnk1;

    .line 730
    .line 731
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    new-instance v4, Ljava/util/ArrayList;

    .line 735
    .line 736
    iget-object v0, v0, Lnk1;->b:Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 739
    .line 740
    .line 741
    new-instance v0, Ljava/util/ArrayList;

    .line 742
    .line 743
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 744
    .line 745
    .line 746
    move-result v5

    .line 747
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    :goto_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 755
    .line 756
    .line 757
    move-result v5

    .line 758
    if-eqz v5, :cond_1e

    .line 759
    .line 760
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v5

    .line 764
    check-cast v5, Lr66;

    .line 765
    .line 766
    iget v6, v5, Lr66;->a:F

    .line 767
    .line 768
    const/high16 v8, 0x3f800000    # 1.0f

    .line 769
    .line 770
    mul-float/2addr v6, v8

    .line 771
    iget-object v9, v1, Lry6;->d:Landroid/graphics/Rect;

    .line 772
    .line 773
    iget v10, v9, Landroid/graphics/Rect;->left:I

    .line 774
    .line 775
    int-to-float v10, v10

    .line 776
    add-float/2addr v6, v10

    .line 777
    iget v5, v5, Lr66;->b:F

    .line 778
    .line 779
    mul-float/2addr v5, v8

    .line 780
    iget v8, v9, Landroid/graphics/Rect;->top:I

    .line 781
    .line 782
    int-to-float v8, v8

    .line 783
    add-float/2addr v5, v8

    .line 784
    iget-boolean v8, v1, Lry6;->e:Z

    .line 785
    .line 786
    if-eqz v8, :cond_1d

    .line 787
    .line 788
    int-to-float v8, v12

    .line 789
    sub-float v6, v8, v6

    .line 790
    .line 791
    :cond_1d
    new-instance v8, Lr66;

    .line 792
    .line 793
    invoke-direct {v8, v6, v5}, Lr66;-><init>(FF)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    goto :goto_17

    .line 800
    :cond_1e
    const v1, 0x7f09025a

    .line 801
    .line 802
    .line 803
    invoke-static {v7, v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 808
    .line 809
    .line 810
    :cond_1f
    iget-object v0, v3, Lxj0;->h:Landroid/os/Handler;

    .line 811
    .line 812
    new-instance v1, Lvj0;

    .line 813
    .line 814
    const/4 v4, 0x0

    .line 815
    invoke-direct {v1, v3, v2, v4}, Lvj0;-><init>(Lxj0;Lwv2;I)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 819
    .line 820
    .line 821
    goto :goto_18

    .line 822
    :cond_20
    move/from16 v16, v4

    .line 823
    .line 824
    move v4, v6

    .line 825
    const v0, 0x7f09025b

    .line 826
    .line 827
    .line 828
    if-ne v7, v0, :cond_21

    .line 829
    .line 830
    iget-object v0, v3, Lxj0;->h:Landroid/os/Handler;

    .line 831
    .line 832
    new-instance v1, Lvj0;

    .line 833
    .line 834
    invoke-direct {v1, v3, v2, v4}, Lvj0;-><init>(Lxj0;Lwv2;I)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 838
    .line 839
    .line 840
    :cond_21
    :goto_18
    return v16

    .line 841
    :pswitch_4
    move/from16 v16, v4

    .line 842
    .line 843
    move v4, v6

    .line 844
    iget v1, v1, Landroid/os/Message;->what:I

    .line 845
    .line 846
    iget-object v0, v0, Lyx;->x:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v0, Lay;

    .line 849
    .line 850
    move/from16 v2, v16

    .line 851
    .line 852
    if-ne v1, v2, :cond_22

    .line 853
    .line 854
    invoke-virtual {v0}, Lay;->b()V

    .line 855
    .line 856
    .line 857
    move v4, v2

    .line 858
    :cond_22
    return v4

    .line 859
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method
