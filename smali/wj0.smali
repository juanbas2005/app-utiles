.class public final Lwj0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lxj0;


# direct methods
.method public synthetic constructor <init>(Lxj0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwj0;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lwj0;->x:Lxj0;

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
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lwj0;->w:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const v4, 0x7f090256

    .line 7
    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :try_start_0
    const-string v0, "xj0"

    .line 14
    .line 15
    const-string v1, "Closing camera"

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lwj0;->x:Lxj0;

    .line 21
    .line 22
    iget-object v0, v0, Lxj0;->c:Lzj0;

    .line 23
    .line 24
    iget-object v1, v0, Lzj0;->c:Lay;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Lay;->c()V

    .line 29
    .line 30
    .line 31
    iput-object v5, v0, Lzj0;->c:Lay;

    .line 32
    .line 33
    :cond_0
    iget-object v1, v0, Lzj0;->d:Lwb;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iput-object v5, v0, Lzj0;->d:Lwb;

    .line 38
    .line 39
    :cond_1
    iget-object v1, v0, Lzj0;->a:Landroid/hardware/Camera;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-boolean v4, v0, Lzj0;->e:Z

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/hardware/Camera;->stopPreview()V

    .line 48
    .line 49
    .line 50
    iget-object v1, v0, Lzj0;->l:Lyj0;

    .line 51
    .line 52
    iput-object v5, v1, Lyj0;->a:Lwv2;

    .line 53
    .line 54
    iput-boolean v2, v0, Lzj0;->e:Z

    .line 55
    .line 56
    :cond_2
    iget-object v0, p0, Lwj0;->x:Lxj0;

    .line 57
    .line 58
    iget-object v0, v0, Lxj0;->c:Lzj0;

    .line 59
    .line 60
    iget-object v1, v0, Lzj0;->a:Landroid/hardware/Camera;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V

    .line 65
    .line 66
    .line 67
    iput-object v5, v0, Lzj0;->a:Landroid/hardware/Camera;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception v0

    .line 71
    const-string v1, "xj0"

    .line 72
    .line 73
    const-string v2, "Failed to close camera"

    .line 74
    .line 75
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_0
    iget-object v0, p0, Lwj0;->x:Lxj0;

    .line 79
    .line 80
    iput-boolean v3, v0, Lxj0;->g:Z

    .line 81
    .line 82
    iget-object v0, v0, Lxj0;->d:Landroid/os/Handler;

    .line 83
    .line 84
    const v1, 0x7f090255

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lwj0;->x:Lxj0;

    .line 91
    .line 92
    iget-object p0, p0, Lxj0;->a:Lkb9;

    .line 93
    .line 94
    iget-object v0, p0, Lkb9;->A:Ljava/lang/Object;

    .line 95
    .line 96
    monitor-enter v0

    .line 97
    :try_start_1
    iget v1, p0, Lkb9;->x:I

    .line 98
    .line 99
    sub-int/2addr v1, v3

    .line 100
    iput v1, p0, Lkb9;->x:I

    .line 101
    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    iget-object v1, p0, Lkb9;->A:Ljava/lang/Object;

    .line 105
    .line 106
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    :try_start_2
    iget-object v2, p0, Lkb9;->z:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, Landroid/os/HandlerThread;

    .line 110
    .line 111
    invoke-virtual {v2}, Landroid/os/HandlerThread;->quit()Z

    .line 112
    .line 113
    .line 114
    iput-object v5, p0, Lkb9;->z:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v5, p0, Lkb9;->y:Ljava/lang/Object;

    .line 117
    .line 118
    monitor-exit v1

    .line 119
    goto :goto_1

    .line 120
    :catchall_0
    move-exception p0

    .line 121
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    :try_start_3
    throw p0

    .line 123
    :cond_4
    :goto_1
    monitor-exit v0

    .line 124
    return-void

    .line 125
    :catchall_1
    move-exception p0

    .line 126
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 127
    throw p0

    .line 128
    :pswitch_0
    const-string v0, "xj0"

    .line 129
    .line 130
    iget-object p0, p0, Lwj0;->x:Lxj0;

    .line 131
    .line 132
    iget-object v1, p0, Lxj0;->c:Lzj0;

    .line 133
    .line 134
    :try_start_4
    const-string v2, "Starting preview"

    .line 135
    .line 136
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    iget-object v2, p0, Lxj0;->b:Lqc3;

    .line 140
    .line 141
    iget-object v3, v1, Lzj0;->a:Landroid/hardware/Camera;

    .line 142
    .line 143
    iget-object v5, v2, Lqc3;->x:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v5, Landroid/view/SurfaceHolder;

    .line 146
    .line 147
    if-eqz v5, :cond_5

    .line 148
    .line 149
    invoke-virtual {v3, v5}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_5
    iget-object v2, v2, Lqc3;->y:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v2, Landroid/graphics/SurfaceTexture;

    .line 156
    .line 157
    invoke-virtual {v3, v2}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    .line 158
    .line 159
    .line 160
    :goto_2
    invoke-virtual {v1}, Lzj0;->e()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :catch_1
    move-exception v1

    .line 165
    iget-object p0, p0, Lxj0;->d:Landroid/os/Handler;

    .line 166
    .line 167
    if-eqz p0, :cond_6

    .line 168
    .line 169
    invoke-virtual {p0, v4, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 174
    .line 175
    .line 176
    :cond_6
    const-string p0, "Failed to start preview"

    .line 177
    .line 178
    invoke-static {v0, p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 179
    .line 180
    .line 181
    :goto_3
    return-void

    .line 182
    :pswitch_1
    const-string v0, "xj0"

    .line 183
    .line 184
    iget-object p0, p0, Lwj0;->x:Lxj0;

    .line 185
    .line 186
    iget-object v6, p0, Lxj0;->c:Lzj0;

    .line 187
    .line 188
    :try_start_5
    const-string v7, "Configuring camera"

    .line 189
    .line 190
    invoke-static {v0, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6}, Lzj0;->b()V

    .line 194
    .line 195
    .line 196
    iget-object v7, p0, Lxj0;->d:Landroid/os/Handler;

    .line 197
    .line 198
    if-eqz v7, :cond_c

    .line 199
    .line 200
    iget-object v8, v6, Lzj0;->j:Lvu6;

    .line 201
    .line 202
    if-nez v8, :cond_7

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_7
    iget v5, v6, Lzj0;->k:I

    .line 206
    .line 207
    if-eq v5, v1, :cond_a

    .line 208
    .line 209
    rem-int/lit16 v5, v5, 0xb4

    .line 210
    .line 211
    if-eqz v5, :cond_8

    .line 212
    .line 213
    move v2, v3

    .line 214
    :cond_8
    if-eqz v2, :cond_9

    .line 215
    .line 216
    new-instance v5, Lvu6;

    .line 217
    .line 218
    iget v1, v8, Lvu6;->x:I

    .line 219
    .line 220
    iget v2, v8, Lvu6;->w:I

    .line 221
    .line 222
    invoke-direct {v5, v1, v2}, Lvu6;-><init>(II)V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_9
    move-object v5, v8

    .line 227
    :goto_4
    const v1, 0x7f09025c

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7, v1, v5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 235
    .line 236
    .line 237
    goto :goto_6

    .line 238
    :catch_2
    move-exception v1

    .line 239
    goto :goto_5

    .line 240
    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 241
    .line 242
    const-string v2, "Rotation not calculated yet. Call configure() first."

    .line 243
    .line 244
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 248
    :goto_5
    iget-object p0, p0, Lxj0;->d:Landroid/os/Handler;

    .line 249
    .line 250
    if-eqz p0, :cond_b

    .line 251
    .line 252
    invoke-virtual {p0, v4, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 257
    .line 258
    .line 259
    :cond_b
    const-string p0, "Failed to configure camera"

    .line 260
    .line 261
    invoke-static {v0, p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 262
    .line 263
    .line 264
    :cond_c
    :goto_6
    return-void

    .line 265
    :pswitch_2
    iget-object p0, p0, Lwj0;->x:Lxj0;

    .line 266
    .line 267
    const-string v0, "xj0"

    .line 268
    .line 269
    :try_start_6
    const-string v2, "Opening camera"

    .line 270
    .line 271
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    iget-object v2, p0, Lxj0;->c:Lzj0;

    .line 275
    .line 276
    iget-object v3, v2, Lzj0;->g:Lek0;

    .line 277
    .line 278
    iget v3, v3, Lek0;->a:I

    .line 279
    .line 280
    invoke-static {v3}, Lu55;->m(I)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-ne v3, v1, :cond_d

    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_d
    invoke-static {v3}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    :goto_7
    iput-object v5, v2, Lzj0;->a:Landroid/hardware/Camera;

    .line 292
    .line 293
    if-eqz v5, :cond_e

    .line 294
    .line 295
    iget-object v1, v2, Lzj0;->g:Lek0;

    .line 296
    .line 297
    iget v1, v1, Lek0;->a:I

    .line 298
    .line 299
    invoke-static {v1}, Lu55;->m(I)I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    new-instance v3, Landroid/hardware/Camera$CameraInfo;

    .line 304
    .line 305
    invoke-direct {v3}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 306
    .line 307
    .line 308
    iput-object v3, v2, Lzj0;->b:Landroid/hardware/Camera$CameraInfo;

    .line 309
    .line 310
    invoke-static {v1, v3}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 311
    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_e
    const-string v1, "Failed to open camera"

    .line 315
    .line 316
    invoke-static {v1}, Lrf2;->r(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 317
    .line 318
    .line 319
    goto :goto_8

    .line 320
    :catch_3
    move-exception v1

    .line 321
    iget-object p0, p0, Lxj0;->d:Landroid/os/Handler;

    .line 322
    .line 323
    if-eqz p0, :cond_f

    .line 324
    .line 325
    invoke-virtual {p0, v4, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 330
    .line 331
    .line 332
    :cond_f
    const-string p0, "Failed to open camera"

    .line 333
    .line 334
    invoke-static {v0, p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 335
    .line 336
    .line 337
    :goto_8
    return-void

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
