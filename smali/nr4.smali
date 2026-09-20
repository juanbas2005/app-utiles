.class public final Lnr4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfi2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;


# direct methods
.method public synthetic constructor <init>(Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnr4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lnr4;->x:Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

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
.method public final k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget p2, p0, Lnr4;->w:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x2

    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    iget-object p0, p0, Lnr4;->x:Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;

    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object v2

    .line 24
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    iget-object p0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->H:Ld37;

    .line 27
    .line 28
    invoke-static {p1}, Ld57;->k1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, ":"

    .line 37
    .line 38
    filled-new-array {p2}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const/4 v3, 0x6

    .line 43
    invoke-static {p1, p2, v3}, Ld57;->W0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    const/4 v3, 0x3

    .line 52
    if-eq p2, v3, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 p2, 0x0

    .line 56
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p2}, Lk57;->w0(Ljava/lang/String;)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    const/4 p2, 0x1

    .line 73
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {p2}, Lk57;->w0(Ljava/lang/String;)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_2

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {p1}, Lk57;->w0(Ljava/lang/String;)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-eqz p1, :cond_2

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide p1

    .line 105
    const-wide/16 v7, 0xe10

    .line 106
    .line 107
    mul-long/2addr v3, v7

    .line 108
    const-wide/16 v7, 0x3c

    .line 109
    .line 110
    mul-long/2addr v5, v7

    .line 111
    add-long/2addr v5, v3

    .line 112
    add-long/2addr v5, p1

    .line 113
    goto :goto_1

    .line 114
    :cond_2
    :goto_0
    const-wide/16 v5, 0x0

    .line 115
    .line 116
    :goto_1
    new-instance p1, Ljava/lang/Long;

    .line 117
    .line 118
    invoke-direct {p1, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v0, p1}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    return-object v2

    .line 128
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_5

    .line 135
    .line 136
    iget-object p1, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->E:Lvx0;

    .line 137
    .line 138
    if-eqz p1, :cond_3

    .line 139
    .line 140
    goto/16 :goto_2

    .line 141
    .line 142
    :cond_3
    iget-object p1, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->B:Landroid/view/WindowManager;

    .line 143
    .line 144
    if-nez p1, :cond_4

    .line 145
    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :cond_4
    new-instance v3, Landroid/view/WindowManager$LayoutParams;

    .line 149
    .line 150
    iget v6, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->G:I

    .line 151
    .line 152
    const/16 v7, 0x38

    .line 153
    .line 154
    const/4 v8, -0x3

    .line 155
    const/4 v4, -0x2

    .line 156
    const/4 v5, -0x2

    .line 157
    invoke-direct/range {v3 .. v8}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 158
    .line 159
    .line 160
    const/16 p2, 0x51

    .line 161
    .line 162
    iput p2, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 173
    .line 174
    const/high16 v4, 0x42000000    # 32.0f

    .line 175
    .line 176
    mul-float/2addr v4, p2

    .line 177
    float-to-int p2, v4

    .line 178
    iput p2, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 179
    .line 180
    new-instance p2, Lci0;

    .line 181
    .line 182
    invoke-direct {p2, v1}, Lci0;-><init>(I)V

    .line 183
    .line 184
    .line 185
    iget-object v1, p2, Lci0;->y:Lkg5;

    .line 186
    .line 187
    invoke-virtual {v1, v0}, Lkg5;->G(Landroid/os/Bundle;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lj54;->ON_CREATE:Lj54;

    .line 191
    .line 192
    iget-object v1, p2, Lci0;->x:Lw54;

    .line 193
    .line 194
    invoke-virtual {v1, v0}, Lw54;->f1(Lj54;)V

    .line 195
    .line 196
    .line 197
    sget-object v0, Lj54;->ON_START:Lj54;

    .line 198
    .line 199
    invoke-virtual {v1, v0}, Lw54;->f1(Lj54;)V

    .line 200
    .line 201
    .line 202
    sget-object v0, Lj54;->ON_RESUME:Lj54;

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Lw54;->f1(Lj54;)V

    .line 205
    .line 206
    .line 207
    iput-object p2, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->F:Lci0;

    .line 208
    .line 209
    new-instance v0, Lvx0;

    .line 210
    .line 211
    invoke-direct {v0, p0}, Lvx0;-><init>(Landroid/content/Context;)V

    .line 212
    .line 213
    .line 214
    const v1, 0x7f090235

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    const v1, 0x7f090238

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    sget-object p2, Luq3;->a:Lfw0;

    .line 227
    .line 228
    invoke-virtual {v0, p2}, Lvx0;->setContent(Lgs2;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {p1, v0, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 232
    .line 233
    .line 234
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->E:Lvx0;

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_5
    sget-object p1, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->K:Ld37;

    .line 238
    .line 239
    iget-object p1, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->E:Lvx0;

    .line 240
    .line 241
    if-nez p1, :cond_6

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    :try_start_0
    iget-object p2, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->B:Landroid/view/WindowManager;

    .line 245
    .line 246
    if-eqz p2, :cond_7

    .line 247
    .line 248
    invoke-interface {p2, p1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    .line 250
    .line 251
    :catchall_0
    :cond_7
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->E:Lvx0;

    .line 252
    .line 253
    iget-object p1, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->F:Lci0;

    .line 254
    .line 255
    if-eqz p1, :cond_8

    .line 256
    .line 257
    iget-object p1, p1, Lci0;->x:Lw54;

    .line 258
    .line 259
    sget-object p2, Lj54;->ON_PAUSE:Lj54;

    .line 260
    .line 261
    invoke-virtual {p1, p2}, Lw54;->f1(Lj54;)V

    .line 262
    .line 263
    .line 264
    sget-object p2, Lj54;->ON_STOP:Lj54;

    .line 265
    .line 266
    invoke-virtual {p1, p2}, Lw54;->f1(Lj54;)V

    .line 267
    .line 268
    .line 269
    sget-object p2, Lj54;->ON_DESTROY:Lj54;

    .line 270
    .line 271
    invoke-virtual {p1, p2}, Lw54;->f1(Lj54;)V

    .line 272
    .line 273
    .line 274
    :cond_8
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;->F:Lci0;

    .line 275
    .line 276
    :goto_2
    return-object v2

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
