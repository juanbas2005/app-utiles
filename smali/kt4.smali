.class public final synthetic Lkt4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnt4;


# direct methods
.method public synthetic constructor <init>(Lnt4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkt4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lkt4;->x:Lnt4;

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
.method public final b()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lkt4;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lkt4;->x:Lnt4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    return-object v2

    .line 11
    :pswitch_0
    iget-object p0, p0, Lnt4;->j:Lnz3;

    .line 12
    .line 13
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v2, Lk26;

    .line 22
    .line 23
    invoke-direct {v2, p0, v1}, Lk26;-><init>(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object v2

    .line 27
    :pswitch_1
    iget-object p0, p0, Lnt4;->h:Lnz3;

    .line 28
    .line 29
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lyb5;

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lyb5;->x:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v2, p0

    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    :cond_1
    return-object v2

    .line 43
    :pswitch_2
    iget-object p0, p0, Lnt4;->h:Lnz3;

    .line 44
    .line 45
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lyb5;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    iget-object p0, p0, Lyb5;->w:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ljava/util/List;

    .line 56
    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    :cond_3
    return-object p0

    .line 65
    :pswitch_3
    iget-object p0, p0, Lnt4;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v0, v1}, Lnt4;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    new-instance v2, Lyb5;

    .line 113
    .line 114
    invoke-direct {v2, v0, p0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    return-object v2

    .line 118
    :pswitch_4
    iget-object v0, p0, Lnt4;->a:Ljava/lang/String;

    .line 119
    .line 120
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 123
    .line 124
    .line 125
    iget-object v4, p0, Lnt4;->e:Lz97;

    .line 126
    .line 127
    invoke-virtual {v4}, Lz97;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_5

    .line 138
    .line 139
    goto/16 :goto_3

    .line 140
    .line 141
    :cond_5
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-eqz v6, :cond_b

    .line 161
    .line 162
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, Ljava/lang/String;

    .line 167
    .line 168
    new-instance v7, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v4, v6}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    const/4 v10, 0x1

    .line 182
    if-gt v9, v10, :cond_a

    .line 183
    .line 184
    invoke-static {v8}, Ldt0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    check-cast v8, Ljava/lang/String;

    .line 189
    .line 190
    if-nez v8, :cond_6

    .line 191
    .line 192
    iput-boolean v10, p0, Lnt4;->g:Z

    .line 193
    .line 194
    move-object v8, v6

    .line 195
    :cond_6
    sget-object v9, Lnt4;->n:Lk26;

    .line 196
    .line 197
    invoke-static {v9, v8}, Lk26;->a(Lk26;Ljava/lang/String;)Lxf4;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    new-instance v11, Lmt4;

    .line 202
    .line 203
    invoke-direct {v11}, Lmt4;-><init>()V

    .line 204
    .line 205
    .line 206
    move v12, v1

    .line 207
    :goto_2
    if-eqz v9, :cond_8

    .line 208
    .line 209
    iget-object v13, v9, Lxf4;->c:Lwf4;

    .line 210
    .line 211
    invoke-virtual {v13, v10}, Lwf4;->g(I)Luf4;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget-object v13, v13, Luf4;->a:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v14, v11, Lmt4;->b:Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    invoke-virtual {v9}, Lxf4;->b()Lre3;

    .line 226
    .line 227
    .line 228
    move-result-object v13

    .line 229
    iget v13, v13, Lpe3;->w:I

    .line 230
    .line 231
    if-le v13, v12, :cond_7

    .line 232
    .line 233
    invoke-virtual {v9}, Lxf4;->b()Lre3;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    iget v13, v13, Lpe3;->w:I

    .line 238
    .line 239
    invoke-virtual {v8, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    invoke-static {v12}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    :cond_7
    const-string v12, "([\\s\\S]+?)?"

    .line 254
    .line 255
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Lxf4;->b()Lre3;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    iget v12, v12, Lpe3;->x:I

    .line 263
    .line 264
    add-int/2addr v12, v10

    .line 265
    invoke-virtual {v9}, Lxf4;->c()Lxf4;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    goto :goto_2

    .line 270
    :cond_8
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-ge v12, v9, :cond_9

    .line 275
    .line 276
    invoke-virtual {v8, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    invoke-static {v8}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    :cond_9
    const-string v8, "$"

    .line 291
    .line 292
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-static {v7}, Lnt4;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    iput-object v7, v11, Lmt4;->a:Ljava/lang/String;

    .line 304
    .line 305
    invoke-interface {v3, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    :cond_a
    const-string p0, " must only be present once in "

    .line 311
    .line 312
    const-string v1, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."

    .line 313
    .line 314
    const-string v3, "Query parameter "

    .line 315
    .line 316
    invoke-static {v3, v6, p0, v0, v1}, Lpb4;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_b
    :goto_3
    move-object v2, v3

    .line 325
    :goto_4
    return-object v2

    .line 326
    :pswitch_5
    iget-object p0, p0, Lnt4;->a:Ljava/lang/String;

    .line 327
    .line 328
    sget-object v0, Lnt4;->r:Lk26;

    .line 329
    .line 330
    invoke-virtual {v0, p0}, Lk26;->e(Ljava/lang/CharSequence;)Z

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    return-object p0

    .line 339
    :pswitch_6
    iget-object p0, p0, Lnt4;->c:Ljava/lang/String;

    .line 340
    .line 341
    if-eqz p0, :cond_c

    .line 342
    .line 343
    new-instance v2, Lk26;

    .line 344
    .line 345
    invoke-direct {v2, p0, v1}, Lk26;-><init>(Ljava/lang/String;I)V

    .line 346
    .line 347
    .line 348
    :cond_c
    return-object v2

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
