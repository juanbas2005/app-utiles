.class public final Lqp1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Iterator;
.implements Lar3;


# instance fields
.field public A:I

.field public final synthetic B:Lrp1;

.field public w:I

.field public x:I

.field public y:I

.field public z:Lre3;


# direct methods
.method public constructor <init>(Lrp1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqp1;->B:Lrp1;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lqp1;->w:I

    .line 8
    .line 9
    iget-object p1, p1, Lrp1;->a:Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {v0, v0, p1}, Lz65;->p(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lqp1;->x:I

    .line 21
    .line 22
    iput p1, p0, Lqp1;->y:I

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lqp1;->B:Lrp1;

    .line 2
    .line 3
    iget-object v1, v0, Lrp1;->a:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget v2, p0, Lqp1;->y:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-gez v2, :cond_0

    .line 9
    .line 10
    iput v3, p0, Lqp1;->w:I

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lqp1;->z:Lre3;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget v4, v0, Lrp1;->b:I

    .line 17
    .line 18
    const/4 v5, -0x1

    .line 19
    const/4 v6, 0x1

    .line 20
    if-lez v4, :cond_1

    .line 21
    .line 22
    iget v7, p0, Lqp1;->A:I

    .line 23
    .line 24
    add-int/2addr v7, v6

    .line 25
    iput v7, p0, Lqp1;->A:I

    .line 26
    .line 27
    if-ge v7, v4, :cond_2

    .line 28
    .line 29
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-le v2, v4, :cond_3

    .line 34
    .line 35
    :cond_2
    new-instance v0, Lre3;

    .line 36
    .line 37
    iget v2, p0, Lqp1;->x:I

    .line 38
    .line 39
    invoke-static {v1}, Ld57;->C0(Ljava/lang/CharSequence;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-direct {v0, v2, v1, v6}, Lpe3;-><init>(III)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lqp1;->z:Lre3;

    .line 47
    .line 48
    iput v5, p0, Lqp1;->y:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    iget-object v0, v0, Lrp1;->c:Lgs2;

    .line 52
    .line 53
    iget v2, p0, Lqp1;->y:I

    .line 54
    .line 55
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v0, v1, v2}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lyb5;

    .line 64
    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    new-instance v0, Lre3;

    .line 68
    .line 69
    iget v2, p0, Lqp1;->x:I

    .line 70
    .line 71
    invoke-static {v1}, Ld57;->C0(Ljava/lang/CharSequence;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-direct {v0, v2, v1, v6}, Lpe3;-><init>(III)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lqp1;->z:Lre3;

    .line 79
    .line 80
    iput v5, p0, Lqp1;->y:I

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    iget-object v1, v0, Lyb5;->w:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v0, v0, Lyb5;->x:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    iget v2, p0, Lqp1;->x:I

    .line 100
    .line 101
    invoke-static {v2, v1}, Lz65;->V(II)Lre3;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iput-object v2, p0, Lqp1;->z:Lre3;

    .line 106
    .line 107
    add-int/2addr v1, v0

    .line 108
    iput v1, p0, Lqp1;->x:I

    .line 109
    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    move v3, v6

    .line 113
    :cond_5
    add-int/2addr v1, v3

    .line 114
    iput v1, p0, Lqp1;->y:I

    .line 115
    .line 116
    :goto_0
    iput v6, p0, Lqp1;->w:I

    .line 117
    .line 118
    return-void
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
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

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lqp1;->w:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lqp1;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget p0, p0, Lqp1;->w:I

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne p0, v0, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lqp1;->w:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lqp1;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lqp1;->w:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lqp1;->z:Lre3;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lqp1;->z:Lre3;

    .line 20
    .line 21
    iput v1, p0, Lqp1;->w:I

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    invoke-static {}, Lrf2;->c()V

    .line 25
    .line 26
    .line 27
    return-object v2
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
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
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
