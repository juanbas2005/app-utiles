.class public final Lq45;
.super Ltv4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final h:Lg30;

.field public i:Z


# direct methods
.method public constructor <init>(Lg30;Lr45;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lg30;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, p2, v0, v1}, Ltv4;-><init>(Lyv4;ZI)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lq45;->h:Lg30;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lq45;->i:Z

    .line 11
    .line 12
    return-void
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
.method public final c()V
    .locals 4

    .line 1
    iget-object p0, p0, Lq45;->h:Lg30;

    .line 2
    .line 3
    iget v0, p0, Lg30;->d:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lrq2;

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-string v2, "FragmentManager"

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v3, "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager "

    .line 25
    .line 26
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, "cancelBackStackTransition for transition "

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lrq2;->h:Lq30;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object v0, p0, Lrq2;->h:Lq30;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    iput-boolean v1, v0, Lq30;->r:Z

    .line 70
    .line 71
    invoke-virtual {v0}, Lq30;->d()V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lrq2;->h:Lq30;

    .line 75
    .line 76
    new-instance v2, Ly0;

    .line 77
    .line 78
    const/16 v3, 0x10

    .line 79
    .line 80
    invoke-direct {v2, v3, p0}, Ly0;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v3, v0, Lq30;->p:Ljava/util/ArrayList;

    .line 84
    .line 85
    if-nez v3, :cond_2

    .line 86
    .line 87
    new-instance v3, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v3, v0, Lq30;->p:Ljava/util/ArrayList;

    .line 93
    .line 94
    :cond_2
    iget-object v0, v0, Lq30;->p:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lrq2;->h:Lq30;

    .line 100
    .line 101
    const/4 v2, 0x1

    .line 102
    invoke-virtual {v0, v1, v2}, Lq30;->e(ZZ)I

    .line 103
    .line 104
    .line 105
    iput-boolean v2, p0, Lrq2;->i:Z

    .line 106
    .line 107
    invoke-virtual {p0, v2}, Lrq2;->A(Z)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lrq2;->F()V

    .line 111
    .line 112
    .line 113
    iput-boolean v1, p0, Lrq2;->i:Z

    .line 114
    .line 115
    const/4 v0, 0x0

    .line 116
    iput-object v0, p0, Lrq2;->h:Lq30;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_1
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, Lf1;

    .line 122
    .line 123
    invoke-virtual {p0}, Lf1;->k()V

    .line 124
    .line 125
    .line 126
    :cond_3
    :goto_0
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final d()V
    .locals 10

    .line 1
    iget-object p0, p0, Lq45;->h:Lg30;

    .line 2
    .line 3
    iget v0, p0, Lg30;->d:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg30;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Llf;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Llf;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :pswitch_0
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Liu4;

    .line 20
    .line 21
    invoke-virtual {p0}, Liu4;->c()V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :pswitch_1
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lrq2;

    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const-string v2, "FragmentManager"

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v3, "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager "

    .line 42
    .line 43
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-object v1, p0, Lrq2;->j:Lg30;

    .line 57
    .line 58
    iget-object v3, p0, Lrq2;->n:Ljava/util/ArrayList;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    iput-boolean v4, p0, Lrq2;->i:Z

    .line 62
    .line 63
    invoke-virtual {p0, v4}, Lrq2;->A(Z)Z

    .line 64
    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    iput-boolean v5, p0, Lrq2;->i:Z

    .line 68
    .line 69
    iget-object v6, p0, Lrq2;->h:Lq30;

    .line 70
    .line 71
    if-eqz v6, :cond_a

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    const/4 v7, 0x0

    .line 78
    if-nez v6, :cond_3

    .line 79
    .line 80
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 81
    .line 82
    iget-object v8, p0, Lrq2;->h:Lq30;

    .line 83
    .line 84
    invoke-static {v8}, Lrq2;->G(Lq30;)Ljava/util/HashSet;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-direct {v6, v8}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_3

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    if-nez v8, :cond_2

    .line 106
    .line 107
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-nez v9, :cond_1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, Lbq2;

    .line 123
    .line 124
    throw v7

    .line 125
    :cond_2
    invoke-static {}, Lku4;->a()V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_4

    .line 129
    .line 130
    :cond_3
    iget-object v3, p0, Lrq2;->h:Lq30;

    .line 131
    .line 132
    iget-object v3, v3, Lq30;->a:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-eqz v6, :cond_5

    .line 143
    .line 144
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, Lar2;

    .line 149
    .line 150
    iget-object v6, v6, Lar2;->b:Lbq2;

    .line 151
    .line 152
    if-eqz v6, :cond_4

    .line 153
    .line 154
    iput-boolean v5, v6, Lbq2;->I:Z

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    .line 158
    .line 159
    iget-object v6, p0, Lrq2;->h:Lq30;

    .line 160
    .line 161
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, v3, v5, v4}, Lrq2;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eqz v4, :cond_7

    .line 181
    .line 182
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    check-cast v4, Lun1;

    .line 187
    .line 188
    iget-object v5, v4, Lun1;->c:Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_6

    .line 195
    .line 196
    const-string v6, "SpecialEffectsController: Completing Back "

    .line 197
    .line 198
    invoke-static {v2, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    :cond_6
    invoke-virtual {v4, v5}, Lun1;->k(Ljava/util/List;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4, v5}, Lun1;->c(Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    iget-object v3, p0, Lrq2;->h:Lq30;

    .line 209
    .line 210
    iget-object v3, v3, Lq30;->a:Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    :cond_8
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_9

    .line 221
    .line 222
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Lar2;

    .line 227
    .line 228
    iget-object v4, v4, Lar2;->b:Lbq2;

    .line 229
    .line 230
    if-eqz v4, :cond_8

    .line 231
    .line 232
    iget-object v5, v4, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 233
    .line 234
    if-nez v5, :cond_8

    .line 235
    .line 236
    invoke-virtual {p0, v4}, Lrq2;->g(Lbq2;)Lwq2;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    invoke-virtual {v4}, Lwq2;->k()V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_9
    iput-object v7, p0, Lrq2;->h:Lq30;

    .line 245
    .line 246
    invoke-virtual {p0}, Lrq2;->i0()V

    .line 247
    .line 248
    .line 249
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_e

    .line 254
    .line 255
    const-string v0, "Op is being set to null"

    .line 256
    .line 257
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    new-instance v0, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v3, "OnBackPressedCallback enabled="

    .line 263
    .line 264
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iget-boolean v1, v1, Lg30;->b:Z

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v1, " for  FragmentManager "

    .line 273
    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_a
    iget-boolean v1, v1, Lg30;->b:Z

    .line 289
    .line 290
    if-eqz v1, :cond_c

    .line 291
    .line 292
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    if-eqz v0, :cond_b

    .line 297
    .line 298
    const-string v0, "Calling popBackStackImmediate via onBackPressed callback"

    .line 299
    .line 300
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    :cond_b
    invoke-virtual {p0}, Lrq2;->T()Z

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_c
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_d

    .line 312
    .line 313
    const-string v0, "Calling onBackPressed via onBackPressed callback"

    .line 314
    .line 315
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    :cond_d
    iget-object p0, p0, Lrq2;->g:Lv45;

    .line 319
    .line 320
    invoke-virtual {p0}, Lv45;->b()Lt45;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    invoke-virtual {p0}, Lzv4;->a()V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :pswitch_2
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast p0, Lf1;

    .line 331
    .line 332
    invoke-virtual {p0}, Lf1;->l()V

    .line 333
    .line 334
    .line 335
    :cond_e
    :goto_4
    return-void

    .line 336
    nop

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final e(Lqv4;)V
    .locals 10

    .line 1
    new-instance v0, Le30;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Le30;-><init>(Lqv4;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lq45;->h:Lg30;

    .line 7
    .line 8
    iget p1, p0, Lg30;->d:I

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :pswitch_0
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lrq2;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-static {p1}, Lrq2;->L(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager "

    .line 31
    .line 32
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v1, p0, Lrq2;->h:Lq30;

    .line 46
    .line 47
    if-eqz v1, :cond_6

    .line 48
    .line 49
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    iget-object v3, p0, Lrq2;->h:Lq30;

    .line 52
    .line 53
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x1

    .line 62
    invoke-virtual {p0, v1, v3, v4}, Lrq2;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Lun1;

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {p1}, Lrq2;->L(I)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_2

    .line 90
    .line 91
    new-instance v5, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v6, "SpecialEffectsController: Processing Progress "

    .line 94
    .line 95
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget v6, v0, Le30;->c:F

    .line 99
    .line 100
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_2
    iget-object v5, v4, Lun1;->c:Ljava/util/ArrayList;

    .line 111
    .line 112
    new-instance v6, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_3

    .line 126
    .line 127
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    check-cast v7, Lgz6;

    .line 132
    .line 133
    iget-object v7, v7, Lgz6;->k:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-static {v6, v7}, Lit0;->h0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_3
    invoke-static {v6}, Ldt0;->g1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Ljava/lang/Iterable;

    .line 144
    .line 145
    invoke-static {v5}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    move v7, v3

    .line 154
    :goto_1
    if-ge v7, v6, :cond_1

    .line 155
    .line 156
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    check-cast v8, Lfz6;

    .line 161
    .line 162
    iget-object v9, v4, Lun1;->a:Landroid/view/ViewGroup;

    .line 163
    .line 164
    invoke-virtual {v8, v0, v9}, Lfz6;->c(Le30;Landroid/view/ViewGroup;)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v7, v7, 0x1

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    iget-object p0, p0, Lrq2;->n:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-nez p1, :cond_5

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    invoke-static {p0}, Lpb4;->g(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    throw p0

    .line 188
    :pswitch_1
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p0, Lf1;

    .line 191
    .line 192
    invoke-virtual {p0, v0}, Lf1;->m(Le30;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    :goto_2
    return-void

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
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
.end method

.method public final f(Lqv4;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Le30;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Le30;-><init>(Lqv4;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lq45;->h:Lg30;

    .line 10
    .line 11
    iget p1, p0, Lg30;->d:I

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :pswitch_0
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lrq2;

    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    invoke-static {p1}, Lrq2;->L(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager "

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "FragmentManager"

    .line 43
    .line 44
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {p0}, Lrq2;->x()V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lqq2;

    .line 51
    .line 52
    invoke-direct {p1, p0}, Lqq2;-><init>(Lrq2;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, p1, v0}, Lrq2;->y(Loq2;Z)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    iget-object p0, p0, Lg30;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, Lf1;

    .line 63
    .line 64
    invoke-virtual {p0}, Lf1;->n()V

    .line 65
    .line 66
    .line 67
    :goto_0
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final j(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq45;->i:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lq45;->h:Lg30;

    .line 6
    .line 7
    iget-boolean p1, p1, Lg30;->b:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Ltv4;->i(Z)V

    .line 15
    .line 16
    .line 17
    return-void
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
