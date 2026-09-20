.class public final Lzd0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfi2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lyx6;


# direct methods
.method public synthetic constructor <init>(Lyx6;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzd0;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lzd0;->x:Lyx6;

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
    .locals 1

    .line 1
    iget p2, p0, Lzd0;->w:I

    .line 2
    .line 3
    sget-object v0, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget-object p0, p0, Lzd0;->x:Lyx6;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ldf3;

    .line 11
    .line 12
    instance-of p2, p1, Lr23;

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    instance-of p2, p1, Ls23;

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    check-cast p1, Ls23;

    .line 25
    .line 26
    iget-object p1, p1, Ls23;->a:Lr23;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    instance-of p2, p1, Ldk2;

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    instance-of p2, p1, Lek2;

    .line 41
    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    check-cast p1, Lek2;

    .line 45
    .line 46
    iget-object p1, p1, Lek2;->a:Ldk2;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    instance-of p2, p1, Leo5;

    .line 53
    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    instance-of p2, p1, Lfo5;

    .line 61
    .line 62
    if-eqz p2, :cond_5

    .line 63
    .line 64
    check-cast p1, Lfo5;

    .line 65
    .line 66
    iget-object p1, p1, Lfo5;->a:Leo5;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    instance-of p2, p1, Ldo5;

    .line 73
    .line 74
    if-eqz p2, :cond_6

    .line 75
    .line 76
    check-cast p1, Ldo5;

    .line 77
    .line 78
    iget-object p1, p1, Ldo5;->a:Leo5;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_6
    instance-of p2, p1, Lvy1;

    .line 85
    .line 86
    if-eqz p2, :cond_7

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_7
    instance-of p2, p1, Lwy1;

    .line 93
    .line 94
    if-eqz p2, :cond_8

    .line 95
    .line 96
    check-cast p1, Lwy1;

    .line 97
    .line 98
    iget-object p1, p1, Lwy1;->a:Lvy1;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_8
    instance-of p2, p1, Luy1;

    .line 105
    .line 106
    if-eqz p2, :cond_9

    .line 107
    .line 108
    check-cast p1, Luy1;

    .line 109
    .line 110
    iget-object p1, p1, Luy1;->a:Lvy1;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :cond_9
    :goto_0
    return-object v0

    .line 116
    :pswitch_0
    check-cast p1, Ldf3;

    .line 117
    .line 118
    instance-of p2, p1, Lr23;

    .line 119
    .line 120
    if-eqz p2, :cond_a

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_a
    instance-of p2, p1, Ls23;

    .line 127
    .line 128
    if-eqz p2, :cond_b

    .line 129
    .line 130
    check-cast p1, Ls23;

    .line 131
    .line 132
    iget-object p1, p1, Ls23;->a:Lr23;

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_b
    instance-of p2, p1, Ldk2;

    .line 139
    .line 140
    if-eqz p2, :cond_c

    .line 141
    .line 142
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_c
    instance-of p2, p1, Lek2;

    .line 147
    .line 148
    if-eqz p2, :cond_d

    .line 149
    .line 150
    check-cast p1, Lek2;

    .line 151
    .line 152
    iget-object p1, p1, Lek2;->a:Ldk2;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_d
    instance-of p2, p1, Leo5;

    .line 159
    .line 160
    if-eqz p2, :cond_e

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_e
    instance-of p2, p1, Lfo5;

    .line 167
    .line 168
    if-eqz p2, :cond_f

    .line 169
    .line 170
    check-cast p1, Lfo5;

    .line 171
    .line 172
    iget-object p1, p1, Lfo5;->a:Leo5;

    .line 173
    .line 174
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_f
    instance-of p2, p1, Ldo5;

    .line 179
    .line 180
    if-eqz p2, :cond_10

    .line 181
    .line 182
    check-cast p1, Ldo5;

    .line 183
    .line 184
    iget-object p1, p1, Ldo5;->a:Leo5;

    .line 185
    .line 186
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_10
    instance-of p2, p1, Lvy1;

    .line 191
    .line 192
    if-eqz p2, :cond_11

    .line 193
    .line 194
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_11
    instance-of p2, p1, Lwy1;

    .line 199
    .line 200
    if-eqz p2, :cond_12

    .line 201
    .line 202
    check-cast p1, Lwy1;

    .line 203
    .line 204
    iget-object p1, p1, Lwy1;->a:Lvy1;

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_12
    instance-of p2, p1, Luy1;

    .line 211
    .line 212
    if-eqz p2, :cond_13

    .line 213
    .line 214
    check-cast p1, Luy1;

    .line 215
    .line 216
    iget-object p1, p1, Luy1;->a:Lvy1;

    .line 217
    .line 218
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    :cond_13
    :goto_1
    return-object v0

    .line 222
    :pswitch_1
    check-cast p1, Ldf3;

    .line 223
    .line 224
    instance-of p2, p1, Lr23;

    .line 225
    .line 226
    if-eqz p2, :cond_14

    .line 227
    .line 228
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_14
    instance-of p2, p1, Ls23;

    .line 233
    .line 234
    if-eqz p2, :cond_15

    .line 235
    .line 236
    check-cast p1, Ls23;

    .line 237
    .line 238
    iget-object p1, p1, Ls23;->a:Lr23;

    .line 239
    .line 240
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_15
    instance-of p2, p1, Ldk2;

    .line 245
    .line 246
    if-eqz p2, :cond_16

    .line 247
    .line 248
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_16
    instance-of p2, p1, Lek2;

    .line 253
    .line 254
    if-eqz p2, :cond_17

    .line 255
    .line 256
    check-cast p1, Lek2;

    .line 257
    .line 258
    iget-object p1, p1, Lek2;->a:Ldk2;

    .line 259
    .line 260
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_17
    instance-of p2, p1, Leo5;

    .line 265
    .line 266
    if-eqz p2, :cond_18

    .line 267
    .line 268
    invoke-virtual {p0, p1}, Lyx6;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_18
    instance-of p2, p1, Lfo5;

    .line 273
    .line 274
    if-eqz p2, :cond_19

    .line 275
    .line 276
    check-cast p1, Lfo5;

    .line 277
    .line 278
    iget-object p1, p1, Lfo5;->a:Leo5;

    .line 279
    .line 280
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_19
    instance-of p2, p1, Ldo5;

    .line 285
    .line 286
    if-eqz p2, :cond_1a

    .line 287
    .line 288
    check-cast p1, Ldo5;

    .line 289
    .line 290
    iget-object p1, p1, Ldo5;->a:Leo5;

    .line 291
    .line 292
    invoke-virtual {p0, p1}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    :cond_1a
    :goto_2
    return-object v0

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
