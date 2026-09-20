.class public Lhu4;
.super Lnx4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnx4;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0017\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lhu4;",
        "Lnx4;",
        "Leu4;",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lmx4;
    value = "navigation"
.end annotation


# instance fields
.field public final c:Lox4;


# direct methods
.method public constructor <init>(Lox4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhu4;->c:Lox4;

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


# virtual methods
.method public bridge synthetic a()Lqt4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lhu4;->g()Leu4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
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
.end method

.method public final d(Ljava/util/List;Lwu4;)V
    .locals 6

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_c

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lzs4;

    .line 16
    .line 17
    iget-object v1, v0, Lzs4;->x:Lqt4;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast v1, Leu4;

    .line 23
    .line 24
    iget-object v2, v1, Lqt4;->x:Lao;

    .line 25
    .line 26
    new-instance v3, Lh06;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, Lzs4;->D:Lbt4;

    .line 32
    .line 33
    invoke-virtual {v0}, Lbt4;->a()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, v3, Lh06;->w:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v0, v1, Leu4;->B:Lr14;

    .line 40
    .line 41
    iget v1, v0, Lr14;->w:I

    .line 42
    .line 43
    iget-object v4, v0, Lr14;->A:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, Ljava/lang/String;

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget p0, v2, Lao;->a:I

    .line 56
    .line 57
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object p1, v0, Lr14;->x:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Leu4;

    .line 67
    .line 68
    iget-object p1, p1, Lqt4;->x:Lao;

    .line 69
    .line 70
    iget p1, p1, Lao;->a:I

    .line 71
    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const-string p0, "the root navigation"

    .line 76
    .line 77
    :goto_1
    const-string p1, "no start destination defined via app:startDestination for "

    .line 78
    .line 79
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lku4;->g(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    :goto_2
    const/4 v2, 0x0

    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0, v4, v2}, Lr14;->b(Ljava/lang/String;Z)Lqt4;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    iget-object v5, v0, Lr14;->y:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v5, Lcz6;

    .line 98
    .line 99
    invoke-virtual {v5, v1}, Lcz6;->c(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Lqt4;

    .line 104
    .line 105
    :goto_3
    if-nez v1, :cond_6

    .line 106
    .line 107
    iget-object p0, v0, Lr14;->z:Ljava/io/Serializable;

    .line 108
    .line 109
    check-cast p0, Ljava/lang/String;

    .line 110
    .line 111
    if-nez p0, :cond_5

    .line 112
    .line 113
    iget-object p0, v0, Lr14;->A:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Ljava/lang/String;

    .line 116
    .line 117
    if-nez p0, :cond_4

    .line 118
    .line 119
    iget p0, v0, Lr14;->w:I

    .line 120
    .line 121
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :cond_4
    iput-object p0, v0, Lr14;->z:Ljava/io/Serializable;

    .line 126
    .line 127
    :cond_5
    iget-object p0, v0, Lr14;->z:Ljava/io/Serializable;

    .line 128
    .line 129
    check-cast p0, Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    const-string p1, "navigation destination "

    .line 135
    .line 136
    const-string p2, " is not a direct child of this NavGraph"

    .line 137
    .line 138
    invoke-static {p1, p0, p2}, Lf21;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_6
    iget-object v0, v1, Lqt4;->x:Lao;

    .line 147
    .line 148
    if-eqz v4, :cond_b

    .line 149
    .line 150
    iget-object v5, v0, Lao;->e:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v5, Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-nez v5, :cond_9

    .line 159
    .line 160
    invoke-virtual {v0, v4}, Lao;->e(Ljava/lang/String;)Lpt4;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    iget-object v0, v0, Lpt4;->x:Landroid/os/Bundle;

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_7
    const/4 v0, 0x0

    .line 170
    :goto_4
    if-eqz v0, :cond_9

    .line 171
    .line 172
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-nez v4, :cond_9

    .line 177
    .line 178
    new-array v4, v2, [Lyb5;

    .line 179
    .line 180
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, [Lyb5;

    .line 185
    .line 186
    invoke-static {v2}, Ltf4;->j([Lyb5;)Landroid/os/Bundle;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, v3, Lh06;->w:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Landroid/os/Bundle;

    .line 196
    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 200
    .line 201
    .line 202
    :cond_8
    iput-object v2, v3, Lh06;->w:Ljava/lang/Object;

    .line 203
    .line 204
    :cond_9
    invoke-virtual {v1}, Lqt4;->g()Ljava/util/Map;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_b

    .line 213
    .line 214
    invoke-virtual {v1}, Lqt4;->g()Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    new-instance v2, Lmr0;

    .line 219
    .line 220
    const/4 v4, 0x1

    .line 221
    invoke-direct {v2, v4, v3}, Lmr0;-><init>(ILh06;)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v2}, Lgl0;->a0(Ljava/util/Map;Lvr2;)Ljava/util/ArrayList;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_a

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_a
    const-string p0, ". Missing required arguments ["

    .line 236
    .line 237
    const/16 p1, 0x5d

    .line 238
    .line 239
    const-string p2, "Cannot navigate to startDestination "

    .line 240
    .line 241
    invoke-static {p2, v1, p0, v0, p1}, Lrf2;->k(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_b
    :goto_5
    iget-object v0, p0, Lhu4;->c:Lox4;

    .line 246
    .line 247
    iget-object v2, v1, Lqt4;->w:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v0, v2}, Lox4;->b(Ljava/lang/String;)Lnx4;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {p0}, Lnx4;->b()Lft4;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    iget-object v3, v3, Lh06;->w:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v3, Landroid/os/Bundle;

    .line 260
    .line 261
    invoke-virtual {v1, v3}, Lqt4;->f(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {v2, v1, v3}, Lft4;->b(Lqt4;Landroid/os/Bundle;)Lzs4;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-static {v1}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v0, v1, p2}, Lnx4;->d(Ljava/util/List;Lwu4;)V

    .line 274
    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_c
    return-void
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

.method public g()Leu4;
    .locals 1

    .line 1
    new-instance v0, Leu4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Leu4;-><init>(Lhu4;)V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
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
.end method
