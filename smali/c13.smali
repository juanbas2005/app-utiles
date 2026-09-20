.class public final synthetic Lc13;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lc13;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc13;->x:Ljava/util/List;

    .line 8
    .line 9
    return-void
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
.end method

.method public synthetic constructor <init>(Ljava/util/List;II)V
    .locals 0

    .line 10
    iput p3, p0, Lc13;->w:I

    iput-object p1, p0, Lc13;->x:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lc13;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object p0, p0, Lc13;->x:Ljava/util/List;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v5, p1

    .line 12
    check-cast v5, Ljava/lang/CharSequence;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/4 v0, 0x0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-ne p2, v2, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, Ldt0;->P0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/String;

    .line 36
    .line 37
    const/4 p2, 0x4

    .line 38
    invoke-static {v5, p0, p1, v0, p2}, Ld57;->G0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-gez p1, :cond_1

    .line 43
    .line 44
    :cond_0
    move-object p2, v1

    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Lyb5;

    .line 52
    .line 53
    invoke-direct {p2, p1, p0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_2
    new-instance p2, Lre3;

    .line 59
    .line 60
    if-gez p1, :cond_3

    .line 61
    .line 62
    move p1, v0

    .line 63
    :cond_3
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-direct {p2, p1, v3, v2}, Lpe3;-><init>(III)V

    .line 68
    .line 69
    .line 70
    instance-of v2, v5, Ljava/lang/String;

    .line 71
    .line 72
    iget v9, p2, Lpe3;->y:I

    .line 73
    .line 74
    iget p2, p2, Lpe3;->x:I

    .line 75
    .line 76
    if-eqz v2, :cond_9

    .line 77
    .line 78
    if-lez v9, :cond_4

    .line 79
    .line 80
    if-le p1, p2, :cond_5

    .line 81
    .line 82
    :cond_4
    if-gez v9, :cond_0

    .line 83
    .line 84
    if-gt p2, p1, :cond_0

    .line 85
    .line 86
    :cond_5
    :goto_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    move-object v4, v3

    .line 101
    check-cast v4, Ljava/lang/String;

    .line 102
    .line 103
    move-object v6, v5

    .line 104
    check-cast v6, Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-virtual {v4, v0, v6, p1, v7}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_6

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_7
    move-object v3, v1

    .line 118
    :goto_1
    check-cast v3, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v3, :cond_8

    .line 121
    .line 122
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    new-instance p2, Lyb5;

    .line 127
    .line 128
    invoke-direct {p2, p0, v3}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_8
    if-eq p1, p2, :cond_0

    .line 133
    .line 134
    add-int/2addr p1, v9

    .line 135
    goto :goto_0

    .line 136
    :cond_9
    if-lez v9, :cond_a

    .line 137
    .line 138
    if-le p1, p2, :cond_b

    .line 139
    .line 140
    :cond_a
    if-gez v9, :cond_0

    .line 141
    .line 142
    if-gt p2, p1, :cond_0

    .line 143
    .line 144
    :cond_b
    move v6, p1

    .line 145
    :goto_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :cond_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_d

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    move-object v3, v0

    .line 160
    check-cast v3, Ljava/lang/String;

    .line 161
    .line 162
    const/4 v4, 0x0

    .line 163
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    const/4 v8, 0x0

    .line 168
    invoke-static/range {v3 .. v8}, Ld57;->Q0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_c

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_d
    move-object v0, v1

    .line 176
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 177
    .line 178
    if-eqz v0, :cond_e

    .line 179
    .line 180
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    new-instance p2, Lyb5;

    .line 185
    .line 186
    invoke-direct {p2, p0, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_e
    if-eq v6, p2, :cond_0

    .line 191
    .line 192
    add-int/2addr v6, v9

    .line 193
    goto :goto_2

    .line 194
    :goto_4
    if-eqz p2, :cond_f

    .line 195
    .line 196
    iget-object p0, p2, Lyb5;->w:Ljava/lang/Object;

    .line 197
    .line 198
    iget-object p1, p2, Lyb5;->x:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p1, Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    new-instance v1, Lyb5;

    .line 211
    .line 212
    invoke-direct {v1, p0, p1}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_f
    return-object v1

    .line 216
    :pswitch_0
    check-cast p1, Lyt2;

    .line 217
    .line 218
    check-cast p2, Ljava/lang/Integer;

    .line 219
    .line 220
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-static {v2}, Lb85;->v(I)I

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    invoke-static {p0, p1, p2}, Lxz5;->f(Ljava/util/List;Lyt2;I)V

    .line 228
    .line 229
    .line 230
    return-object v1

    .line 231
    :pswitch_1
    check-cast p1, Lyt2;

    .line 232
    .line 233
    check-cast p2, Ljava/lang/Integer;

    .line 234
    .line 235
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {v2}, Lb85;->v(I)I

    .line 239
    .line 240
    .line 241
    move-result p2

    .line 242
    invoke-static {p0, p1, p2}, Lt13;->s(Ljava/util/List;Lyt2;I)V

    .line 243
    .line 244
    .line 245
    return-object v1

    .line 246
    :pswitch_2
    check-cast p1, Lyt2;

    .line 247
    .line 248
    check-cast p2, Ljava/lang/Integer;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v2}, Lb85;->v(I)I

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    invoke-static {p0, p1, p2}, Lt13;->s(Ljava/util/List;Lyt2;I)V

    .line 258
    .line 259
    .line 260
    return-object v1

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
