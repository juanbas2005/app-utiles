.class public final Ler8;
.super Lph8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:Ly50;


# direct methods
.method public constructor <init>(Ly50;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ler8;->a:Ly50;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lph8;-><init>(Landroid/os/Looper;I)V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 1
    iget-object p0, p0, Ler8;->a:Ly50;

    .line 2
    .line 3
    iget-object v0, p0, Ly50;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 10
    .line 11
    iget v2, p1, Landroid/os/Message;->what:I

    .line 12
    .line 13
    const/4 v3, 0x7

    .line 14
    const/4 v4, 0x2

    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    if-eq v2, v4, :cond_1

    .line 20
    .line 21
    if-eq v2, v5, :cond_1

    .line 22
    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    :goto_0
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lsi8;

    .line 30
    .line 31
    if-eqz p0, :cond_19

    .line 32
    .line 33
    monitor-enter p0

    .line 34
    :try_start_0
    iput-object v6, p0, Lsi8;->a:Ljava/lang/Boolean;

    .line 35
    .line 36
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    iget-object p1, p0, Lsi8;->c:Ly50;

    .line 38
    .line 39
    iget-object v0, p1, Ly50;->l:Ljava/util/ArrayList;

    .line 40
    .line 41
    monitor-enter v0

    .line 42
    :try_start_1
    iget-object p1, p1, Ly50;->l:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p0

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    throw p1

    .line 55
    :cond_2
    const/4 v0, 0x4

    .line 56
    const/4 v1, 0x5

    .line 57
    if-eq v2, v5, :cond_4

    .line 58
    .line 59
    if-eq v2, v3, :cond_4

    .line 60
    .line 61
    if-ne v2, v0, :cond_3

    .line 62
    .line 63
    instance-of v7, p0, Ll49;

    .line 64
    .line 65
    if-eqz v7, :cond_4

    .line 66
    .line 67
    :cond_3
    if-ne v2, v1, :cond_5

    .line 68
    .line 69
    :cond_4
    invoke-virtual {p0}, Ly50;->q()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_18

    .line 74
    .line 75
    :cond_5
    iget v2, p1, Landroid/os/Message;->what:I

    .line 76
    .line 77
    const/16 v7, 0x8

    .line 78
    .line 79
    const/4 v8, 0x3

    .line 80
    if-ne v2, v0, :cond_9

    .line 81
    .line 82
    new-instance v0, Lm11;

    .line 83
    .line 84
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 85
    .line 86
    invoke-direct {v0, p1, v6, v6}, Lm11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Ly50;->u:Lm11;

    .line 90
    .line 91
    invoke-virtual {p0}, Ly50;->v()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_7

    .line 96
    .line 97
    iget-boolean p1, p0, Ly50;->v:Z

    .line 98
    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-virtual {p0, v8, v6}, Ly50;->w(ILandroid/os/IInterface;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_7
    :goto_1
    iget-object p1, p0, Ly50;->u:Lm11;

    .line 107
    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_8
    new-instance p1, Lm11;

    .line 112
    .line 113
    invoke-direct {p1, v7, v6, v6}, Lm11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    iget-object p0, p0, Ly50;->j:Lx50;

    .line 117
    .line 118
    invoke-interface {p0, p1}, Lx50;->f(Lm11;)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_9
    if-ne v2, v1, :cond_b

    .line 126
    .line 127
    iget-object p1, p0, Ly50;->u:Lm11;

    .line 128
    .line 129
    if-eqz p1, :cond_a

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_a
    new-instance p1, Lm11;

    .line 133
    .line 134
    invoke-direct {p1, v7, v6, v6}, Lm11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_3
    iget-object p0, p0, Ly50;->j:Lx50;

    .line 138
    .line 139
    invoke-interface {p0, p1}, Lx50;->f(Lm11;)V

    .line 140
    .line 141
    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_b
    if-ne v2, v8, :cond_d

    .line 147
    .line 148
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 149
    .line 150
    instance-of v1, v0, Landroid/app/PendingIntent;

    .line 151
    .line 152
    if-eqz v1, :cond_c

    .line 153
    .line 154
    check-cast v0, Landroid/app/PendingIntent;

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_c
    move-object v0, v6

    .line 158
    :goto_4
    new-instance v1, Lm11;

    .line 159
    .line 160
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 161
    .line 162
    invoke-direct {v1, p1, v0, v6}, Lm11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    iget-object p0, p0, Ly50;->j:Lx50;

    .line 166
    .line 167
    invoke-interface {p0, v1}, Lx50;->f(Lm11;)V

    .line 168
    .line 169
    .line 170
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_d
    const/4 v0, 0x6

    .line 175
    if-ne v2, v0, :cond_f

    .line 176
    .line 177
    invoke-virtual {p0, v1, v6}, Ly50;->w(ILandroid/os/IInterface;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Ly50;->o:Lv50;

    .line 181
    .line 182
    if-eqz v0, :cond_e

    .line 183
    .line 184
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 185
    .line 186
    invoke-interface {v0, p1}, Lv50;->a(I)V

    .line 187
    .line 188
    .line 189
    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v1, v5, v6}, Ly50;->t(IILandroid/os/IInterface;)Z

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_f
    if-ne v2, v4, :cond_11

    .line 197
    .line 198
    invoke-virtual {p0}, Ly50;->p()Z

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    if-eqz p0, :cond_10

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_10
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast p0, Lsi8;

    .line 208
    .line 209
    if-eqz p0, :cond_19

    .line 210
    .line 211
    monitor-enter p0

    .line 212
    :try_start_3
    iput-object v6, p0, Lsi8;->a:Ljava/lang/Boolean;

    .line 213
    .line 214
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 215
    iget-object p1, p0, Lsi8;->c:Ly50;

    .line 216
    .line 217
    iget-object v0, p1, Ly50;->l:Ljava/util/ArrayList;

    .line 218
    .line 219
    monitor-enter v0

    .line 220
    :try_start_4
    iget-object p1, p1, Ly50;->l:Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    monitor-exit v0

    .line 226
    return-void

    .line 227
    :catchall_2
    move-exception p0

    .line 228
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 229
    throw p0

    .line 230
    :catchall_3
    move-exception p1

    .line 231
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 232
    throw p1

    .line 233
    :cond_11
    :goto_5
    iget p0, p1, Landroid/os/Message;->what:I

    .line 234
    .line 235
    if-eq p0, v4, :cond_13

    .line 236
    .line 237
    if-eq p0, v5, :cond_13

    .line 238
    .line 239
    if-ne p0, v3, :cond_12

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_12
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    new-instance v0, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    add-int/lit8 p1, p1, 0x22

    .line 253
    .line 254
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 255
    .line 256
    .line 257
    const-string p1, "Don\'t know how to handle message: "

    .line 258
    .line 259
    invoke-static {v0, p1, p0}, Lhl6;->p(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    new-instance p1, Ljava/lang/Exception;

    .line 264
    .line 265
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 266
    .line 267
    .line 268
    const-string v0, "GmsClient"

    .line 269
    .line 270
    invoke-static {v0, p0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_13
    :goto_6
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast p0, Lsi8;

    .line 277
    .line 278
    const-string p1, " being reused. This is not safe."

    .line 279
    .line 280
    const-string v0, "Callback proxy "

    .line 281
    .line 282
    monitor-enter p0

    .line 283
    :try_start_6
    iget-object v1, p0, Lsi8;->a:Ljava/lang/Boolean;

    .line 284
    .line 285
    iget-boolean v2, p0, Lsi8;->b:Z

    .line 286
    .line 287
    if-eqz v2, :cond_14

    .line 288
    .line 289
    const-string v2, "GmsClient"

    .line 290
    .line 291
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    add-int/lit8 v4, v4, 0x2f

    .line 300
    .line 301
    new-instance v8, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :catchall_4
    move-exception p1

    .line 324
    goto :goto_a

    .line 325
    :cond_14
    :goto_7
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 326
    if-eqz v1, :cond_17

    .line 327
    .line 328
    iget-object p1, p0, Lsi8;->f:Ly50;

    .line 329
    .line 330
    iget v0, p0, Lsi8;->d:I

    .line 331
    .line 332
    if-nez v0, :cond_15

    .line 333
    .line 334
    invoke-virtual {p0}, Lsi8;->a()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-nez v0, :cond_17

    .line 339
    .line 340
    invoke-virtual {p1, v5, v6}, Ly50;->w(ILandroid/os/IInterface;)V

    .line 341
    .line 342
    .line 343
    new-instance p1, Lm11;

    .line 344
    .line 345
    invoke-direct {p1, v7, v6, v6}, Lm11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0, p1}, Lsi8;->b(Lm11;)V

    .line 349
    .line 350
    .line 351
    goto :goto_9

    .line 352
    :cond_15
    invoke-virtual {p1, v5, v6}, Ly50;->w(ILandroid/os/IInterface;)V

    .line 353
    .line 354
    .line 355
    iget-object p1, p0, Lsi8;->e:Landroid/os/Bundle;

    .line 356
    .line 357
    if-eqz p1, :cond_16

    .line 358
    .line 359
    const-string v1, "pendingIntent"

    .line 360
    .line 361
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    check-cast p1, Landroid/app/PendingIntent;

    .line 366
    .line 367
    goto :goto_8

    .line 368
    :cond_16
    move-object p1, v6

    .line 369
    :goto_8
    new-instance v1, Lm11;

    .line 370
    .line 371
    invoke-direct {v1, v0, p1, v6}, Lm11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p0, v1}, Lsi8;->b(Lm11;)V

    .line 375
    .line 376
    .line 377
    :cond_17
    :goto_9
    monitor-enter p0

    .line 378
    :try_start_7
    iput-boolean v5, p0, Lsi8;->b:Z

    .line 379
    .line 380
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 381
    monitor-enter p0

    .line 382
    :try_start_8
    iput-object v6, p0, Lsi8;->a:Ljava/lang/Boolean;

    .line 383
    .line 384
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 385
    iget-object p1, p0, Lsi8;->c:Ly50;

    .line 386
    .line 387
    iget-object v0, p1, Ly50;->l:Ljava/util/ArrayList;

    .line 388
    .line 389
    monitor-enter v0

    .line 390
    :try_start_9
    iget-object p1, p1, Ly50;->l:Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    monitor-exit v0

    .line 396
    return-void

    .line 397
    :catchall_5
    move-exception p0

    .line 398
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 399
    throw p0

    .line 400
    :catchall_6
    move-exception p1

    .line 401
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 402
    throw p1

    .line 403
    :catchall_7
    move-exception p1

    .line 404
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 405
    throw p1

    .line 406
    :goto_a
    :try_start_c
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 407
    throw p1

    .line 408
    :cond_18
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast p0, Lsi8;

    .line 411
    .line 412
    if-eqz p0, :cond_19

    .line 413
    .line 414
    monitor-enter p0

    .line 415
    :try_start_d
    iput-object v6, p0, Lsi8;->a:Ljava/lang/Boolean;

    .line 416
    .line 417
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 418
    iget-object p1, p0, Lsi8;->c:Ly50;

    .line 419
    .line 420
    iget-object v0, p1, Ly50;->l:Ljava/util/ArrayList;

    .line 421
    .line 422
    monitor-enter v0

    .line 423
    :try_start_e
    iget-object p1, p1, Ly50;->l:Ljava/util/ArrayList;

    .line 424
    .line 425
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    monitor-exit v0

    .line 429
    return-void

    .line 430
    :catchall_8
    move-exception p0

    .line 431
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 432
    throw p0

    .line 433
    :catchall_9
    move-exception p1

    .line 434
    :try_start_f
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 435
    throw p1

    .line 436
    :cond_19
    return-void
    .line 437
.end method
