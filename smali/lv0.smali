.class public final synthetic Llv0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgf6;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Llv0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Llv0;->b:Ljava/lang/Object;

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
.method public final a()Landroid/os/Bundle;
    .locals 5

    .line 1
    iget v0, p0, Llv0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Llv0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lo9;

    .line 9
    .line 10
    iget-object v0, p0, Lo9;->A:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-static {v0}, Lsf4;->b0(Ljava/util/Map;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ld37;

    .line 49
    .line 50
    invoke-virtual {v1}, Ld37;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0, v2, v1}, Lo9;->L(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p0, Lo9;->y:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-static {v0}, Lsf4;->b0(Ljava/util/Map;)Ljava/util/Map;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/util/Map$Entry;

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lgf6;

    .line 97
    .line 98
    invoke-interface {v1}, Lgf6;->a()Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {p0, v2, v1}, Lo9;->L(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    iget-object p0, p0, Lo9;->x:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const/4 v1, 0x0

    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    new-array p0, v1, [Lyb5;

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_3

    .line 142
    .line 143
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Ljava/util/Map$Entry;

    .line 148
    .line 149
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    new-instance v4, Lyb5;

    .line 160
    .line 161
    invoke-direct {v4, v3, v2}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_3
    new-array p0, v1, [Lyb5;

    .line 169
    .line 170
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, [Lyb5;

    .line 175
    .line 176
    :goto_3
    array-length v0, p0

    .line 177
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, [Lyb5;

    .line 182
    .line 183
    invoke-static {p0}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_0
    check-cast p0, Lrq2;

    .line 189
    .line 190
    invoke-virtual {p0}, Lrq2;->Z()Landroid/os/Bundle;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_1
    move-object v0, p0

    .line 196
    check-cast v0, Leq2;

    .line 197
    .line 198
    :cond_4
    invoke-virtual {v0}, Leq2;->p()Lrq2;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-static {p0}, Leq2;->q(Lrq2;)Z

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    if-nez p0, :cond_4

    .line 207
    .line 208
    iget-object p0, v0, Leq2;->S:Lw54;

    .line 209
    .line 210
    sget-object v0, Lj54;->ON_STOP:Lj54;

    .line 211
    .line 212
    invoke-virtual {p0, v0}, Lw54;->f1(Lj54;)V

    .line 213
    .line 214
    .line 215
    new-instance p0, Landroid/os/Bundle;

    .line 216
    .line 217
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 218
    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_2
    check-cast p0, Lse6;

    .line 222
    .line 223
    invoke-virtual {p0}, Lse6;->d()Ljava/util/Map;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    new-instance v0, Landroid/os/Bundle;

    .line 228
    .line 229
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_6

    .line 245
    .line 246
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    check-cast v1, Ljava/util/Map$Entry;

    .line 251
    .line 252
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Ljava/lang/String;

    .line 257
    .line 258
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, Ljava/util/List;

    .line 263
    .line 264
    instance-of v3, v1, Ljava/util/ArrayList;

    .line 265
    .line 266
    if-eqz v3, :cond_5

    .line 267
    .line 268
    check-cast v1, Ljava/util/ArrayList;

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 274
    .line 275
    .line 276
    move-object v1, v3

    .line 277
    :goto_5
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_6
    return-object v0

    .line 282
    :pswitch_3
    check-cast p0, Lrv0;

    .line 283
    .line 284
    new-instance v0, Landroid/os/Bundle;

    .line 285
    .line 286
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 287
    .line 288
    .line 289
    iget-object p0, p0, Lrv0;->E:Lpv0;

    .line 290
    .line 291
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    new-instance v1, Ljava/util/ArrayList;

    .line 295
    .line 296
    iget-object v2, p0, Lpv0;->b:Ljava/util/LinkedHashMap;

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 303
    .line 304
    .line 305
    const-string v3, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"

    .line 306
    .line 307
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 308
    .line 309
    .line 310
    new-instance v1, Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    check-cast v2, Ljava/util/Collection;

    .line 317
    .line 318
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 319
    .line 320
    .line 321
    const-string v2, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"

    .line 322
    .line 323
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 324
    .line 325
    .line 326
    new-instance v1, Ljava/util/ArrayList;

    .line 327
    .line 328
    iget-object v2, p0, Lpv0;->d:Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 331
    .line 332
    .line 333
    const-string v2, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"

    .line 334
    .line 335
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 336
    .line 337
    .line 338
    new-instance v1, Landroid/os/Bundle;

    .line 339
    .line 340
    iget-object p0, p0, Lpv0;->g:Landroid/os/Bundle;

    .line 341
    .line 342
    invoke-direct {v1, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 343
    .line 344
    .line 345
    const-string p0, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"

    .line 346
    .line 347
    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 348
    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
