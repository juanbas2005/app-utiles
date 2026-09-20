.class public final Ltk2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final w:Landroid/graphics/Rect;

.field public final x:Landroid/graphics/Rect;

.field public final y:Z

.field public final z:Lme6;


# direct methods
.method public constructor <init>(ZLme6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltk2;->w:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ltk2;->x:Landroid/graphics/Rect;

    .line 17
    .line 18
    iput-boolean p1, p0, Ltk2;->y:Z

    .line 19
    .line 20
    iput-object p2, p0, Ltk2;->z:Lme6;

    .line 21
    .line 22
    return-void
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
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget-object v0, p0, Ltk2;->z:Lme6;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p1, Lc5;

    .line 7
    .line 8
    iget-object v0, p0, Ltk2;->w:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lc5;->f(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    check-cast p2, Lc5;

    .line 14
    .line 15
    iget-object p1, p0, Ltk2;->x:Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lc5;->f(Landroid/graphics/Rect;)V

    .line 18
    .line 19
    .line 20
    iget p2, v0, Landroid/graphics/Rect;->top:I

    .line 21
    .line 22
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    if-ge p2, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-le p2, v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget p2, v0, Landroid/graphics/Rect;->left:I

    .line 31
    .line 32
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 33
    .line 34
    iget-boolean p0, p0, Ltk2;->y:Z

    .line 35
    .line 36
    if-ge p2, v1, :cond_2

    .line 37
    .line 38
    if-eqz p0, :cond_7

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-le p2, v1, :cond_3

    .line 42
    .line 43
    if-eqz p0, :cond_8

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    iget p2, v0, Landroid/graphics/Rect;->bottom:I

    .line 47
    .line 48
    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    .line 49
    .line 50
    if-ge p2, v1, :cond_4

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    if-le p2, v1, :cond_5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_5
    iget p2, v0, Landroid/graphics/Rect;->right:I

    .line 57
    .line 58
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 59
    .line 60
    if-ge p2, p1, :cond_6

    .line 61
    .line 62
    if-eqz p0, :cond_7

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_6
    if-le p2, p1, :cond_9

    .line 66
    .line 67
    if-eqz p0, :cond_8

    .line 68
    .line 69
    :cond_7
    :goto_0
    const/4 p0, -0x1

    .line 70
    return p0

    .line 71
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_9
    const/4 p0, 0x0

    .line 74
    return p0
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
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
.end method
